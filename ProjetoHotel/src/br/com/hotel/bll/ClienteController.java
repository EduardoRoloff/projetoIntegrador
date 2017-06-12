package br.com.hotel.bll;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.hotel.dal.PCliente;
import br.com.hotel.model.ECliente;

@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PCliente persistencia = new PCliente();
	private static String HOME = "/index.jsp";
	private static String CADASTRARUSUARIO = "/cadastrarUsuario.jsp";
	private static String MINHACONTA = "/minhaConta.jsp";
       
    public ClienteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String funcao = request.getParameter("action");
		
		if(funcao.equals("criar")){
			forward = CADASTRARUSUARIO;
		}
		else if(funcao.equals("minhaConta")){
			forward = MINHACONTA;
		}else if(funcao.equals("excluir")){
			long codcliente = Integer.parseInt(request.getParameter("codcliente"));
			persistencia.deletar(codcliente);
			HttpSession sessao = request.getSession();
			sessao.invalidate();
			forward = HOME;
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
	    view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forward= HOME;
		ECliente cliente = new ECliente();
		HttpSession sessao = request.getSession();
		
		if(request.getParameter("botao").equalsIgnoreCase("cadastrar")){
			cliente.setEmail(request.getParameter("email"));
			cliente.setSenha(request.getParameter("senha"));
			cliente.setNome(request.getParameter("nome"));
			cliente.setSobrenome(request.getParameter("sobrenome"));
			try {
				String email = cliente.getEmail();
				if(persistencia.verificarEmail(email)){
					request.setAttribute("error", "Não foi possível inscrevê-lo porque já existe uma conta para este endereço de e-mail");
					forward = CADASTRARUSUARIO;
				}else{
					persistencia.inserir(cliente);
					try {
						sessao.setAttribute("usuario", persistencia.consultar(cliente));
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}	
			    
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else if(request.getParameter("botao").equalsIgnoreCase("alterarDadosPessoais")){
			System.out.println("Entrei no alterar!");
			cliente = (ECliente)sessao.getAttribute("usuario");
			cliente.setNome(request.getParameter("nome"));
			cliente.setSobrenome(request.getParameter("sobrenome"));
			cliente.setTelefoneresid(request.getParameter("telefoneresid"));
			cliente.setTelefonecelular(request.getParameter("telefonecelular"));
			cliente.setCidade(request.getParameter("cidade"));
			cliente.setEndereco(request.getParameter("endereco"));
			cliente.setEstado(request.getParameter("estado"));
			cliente.setBairro(request.getParameter("bairro"));
			cliente.setCep(request.getParameter("cep"));
			persistencia.alterarDadosPessoais(cliente);
			sessao.setAttribute("usuario", cliente);
			request.setAttribute("dadosalterados", "Dados alterados com sucesso!");
			forward = MINHACONTA;
			
		}
		else if(request.getParameter("botao").equalsIgnoreCase("alterarEmail")){
			
			cliente = (ECliente)sessao.getAttribute("usuario");
			cliente.setSenha(request.getParameter("senha"));
			String email = request.getParameter("email");
			
			try {
				if(persistencia.verificarEmail(email)){
					request.setAttribute("error", "Não foi possível inscrevê-lo porque já existe uma conta para este endereço de e-mail");
				}else{
					if(persistencia.verificarUsuario(cliente)){
						request.setAttribute("emailalterado", "Email alterado com sucesso!");
						cliente.setEmail(email);
						persistencia.alterarEmail(cliente);
						sessao.setAttribute("usuario", cliente);
					}else{
						request.setAttribute("error", "Digite a senha novamente!");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			forward = MINHACONTA;
		}
		else if(request.getParameter("botao").equalsIgnoreCase("alterarSenha")){
			cliente = (ECliente)sessao.getAttribute("usuario");
			cliente.setSenha(request.getParameter("oldsenha"));
			try {
				if(persistencia.verificarSenha(cliente)){
					if(request.getParameter("newsenha").equalsIgnoreCase(request.getParameter("repeatnewsenha"))){
						cliente.setSenha(request.getParameter("newsenha"));
						persistencia.alterarSenha(cliente);
						request.setAttribute("senhaalterada", "Senha alterada com sucesso!");
					}
					else{
						request.setAttribute("error", "As senhas nao conferem!");
					}
				}else{
					request.setAttribute("error", "Senha Atual Incorreta!");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			forward = MINHACONTA;
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
	    view.forward(request, response);
	}

}
