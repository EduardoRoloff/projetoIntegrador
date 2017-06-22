package br.com.hotel.bll.pattern.locacao;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;

import br.com.hotel.dal.LocacaoDAO;
import br.com.hotel.dal.PagamentoDAO;
import br.com.hotel.model.ECliente;
import br.com.hotel.model.EPagamento;

public class EfetuarLocacao implements InterfaceStrategyLocacao {
	private static final String HOME = "index.jsp";
	LocacaoDAO persistencia = new LocacaoDAO();
	PagamentoDAO persisPagamento = new PagamentoDAO();

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		
		//Pega valores da outra JSP
		double valorDiaria = Double.parseDouble(request.getParameter("valorDiaria"));
		long codtipo = Long.parseLong(request.getParameter("codigoQuarto"));
		
		// Pegando os valores da sessão o codigo do cliente
		HttpSession sessao = request.getSession();
		ECliente cliente = new ECliente();
		cliente = (ECliente) sessao.getAttribute("usuario");
		long codcliente = cliente.getCodcliente();
		
		String dataEntrada = "";
		String dataSaida = "";
		
		// Trazendo os dados que foram guardados nos cookies
		Cookie[] cookies = request.getCookies();
	    for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if(cookie.getName().equalsIgnoreCase("dataEntrada")){
				dataEntrada = cookie.getValue();
			}
			if(cookie.getName().equalsIgnoreCase("dataSaida")){
				dataSaida = cookie.getValue();
			}
		}
	    
	    //Preenchendo objeto com o codigo da reserva para inserir em pagamento
	    long codlocacao = persistencia.Inserir(dataSaida, dataEntrada, codtipo, codcliente);
	    EPagamento objeto = new EPagamento();
	    objeto.setNomenocartao(request.getParameter("nomenocartao"));
	    objeto.setBandeira(request.getParameter("cartao"));
	    objeto.setNrocartao(Long.parseLong(request.getParameter("numerocartao")));
	    objeto.setCodigoseguranca(Long.parseLong(request.getParameter("codigoseguranca")));
	    objeto.setMesvencimentocartao(request.getParameter("mesvencimento"));
	    objeto.setAnovencimento(request.getParameter("anovencimento"));
	    objeto.setCpf(request.getParameter("cpf"));
	    objeto.setValorreserva(valorDiaria);
	    objeto.getCliente().setCodcliente(codcliente);
	    objeto.getLocacao().setCodreserva(codlocacao);
	    
	}
}
