package br.com.hotel.bll;

import java.awt.Checkbox;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

/**
 * Servlet implementation class HotelController
 */
@WebServlet("/hotelcontroller.do")
public class HotelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HotelDAO persistencia = new HotelDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HotelController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HotelDAO hdao = new HotelDAO();
		EHotel hotel = new EHotel();
		String action = request.getParameter("action");
		
		if (action != null && action.equals("del")) {
			String codhotel = request.getParameter("txtcodhotel");
			hotel.setCodhotel(Long.parseLong(codhotel));
			hdao.deletar(hotel);
			response.sendRedirect("hotelcontroller.do?action=list");
			
		} else if (action != null && action.equals("update")) {
			String codhotel = request.getParameter("txtcodhotel");
			hotel = hdao.pesquisarHotelCod(Long.parseLong(codhotel));
			request.setAttribute("hotel", hotel);
			RequestDispatcher rd = request.getRequestDispatcher("newcadastroHotel.jsp");
			rd.forward(request, response);

		} else if (action != null && action.equals("list")) {
/*
			hdao = new HotelDAO();
			List<EHotel> listHotel = hdao.listarTodos();
*/			
			Iterator<EHotel> listHotel =  hdao.listarTodos();
			request.setAttribute("listHotel", listHotel);
			RequestDispatcher rd = request.getRequestDispatcher("logado-admsystem.jsp");
			rd.forward(request, response);

		} else if (action != null && action.equals("new")) {
			hotel.setNome("");
			hotel.setTelefone("");
			hotel.setCep("");
			hotel.setEndereco("");
			hotel.setBairro("");
			hotel.setCidade("");
			hotel.setEstado("");
			hotel.setDescricao("");
			hotel.setQtdquarto(0);
			request.setAttribute("hotel", hotel);
			RequestDispatcher rd = request.getRequestDispatcher("newcadastroHotel.jsp");
			rd.forward(request, response);
			
		} else if (action != null && action.equals("view")) {
			String codhotel = request.getParameter("txtcodhotel");
			hotel = hdao.pesquisarHotelCod(Long.parseLong(codhotel));
			request.setAttribute("hotel", hotel);
			RequestDispatcher rd = request.getRequestDispatcher("visualizarcadastroHotel.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("botao").equalsIgnoreCase("buscar")){
			double valorDiaria;
			String entrada = request.getParameter("CheckIn");
			String vetorEntrada[] = entrada.split("-");
			String saida = request.getParameter("CheckOut");
			String vetorSaida[] = saida.split("-");
			LocalDate dataEntrada = LocalDate.of(Integer.parseInt(vetorEntrada[0]), Integer.parseInt(vetorEntrada[1]), Integer.parseInt(vetorEntrada[2]));
			LocalDate dataSaida = LocalDate.of(Integer.parseInt(vetorSaida[0]), Integer.parseInt(vetorSaida[1]), Integer.parseInt(vetorSaida[2]));
			long diferencaDias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
			System.out.printf("Dias: " + diferencaDias);
			try {
		    List<EHotel> lista = new ArrayList<>();
			lista = persistencia.pesquisarHotelCidade(request.getParameter("Destination1Text"));
			for (int i = 0; i < lista.size(); i++) {
				valorDiaria = lista.get(i).getPrecoDiaria();
				lista.get(i).setPrecoDiaria(valorDiaria * diferencaDias);
				System.out.println("Valor diarias: " + lista.get(i).getPrecoDiaria());
				
			}
			request.setAttribute("hoteis", lista);
			RequestDispatcher rd = request.getRequestDispatcher("resultadoBusca.jsp");
			rd.forward(request, response);	
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		
		/*String id = request.getParameter("txtcodhotel");
		String nome = request.getParameter("txtnome");
		String telefone = request.getParameter("txttelefone");
		String cep = request.getParameter("txtcep");
		String endereco = request.getParameter("txtendereco");
		String bairro = request.getParameter("txtbairro");
		String cidade = request.getParameter("txtcidade");
		String estado = request.getParameter("txtestado");
		String descricao = request.getParameter("txtdescricao");
		String classificacao = request.getParameter("txtclassificacao");
		String qtdquarto = request.getParameter("txtqtdquarto");
		String tipohotel = request.getParameter("txttipohotel");
		
		EHotel hotel = new EHotel();
		if(id != ""){
			hotel.setCodhotel(Long.parseLong(id));
		}

		hotel.setNome(nome);
		hotel.setTelefone(telefone);
		hotel.setCep(cep);
		hotel.setEndereco(endereco);
		hotel.setBairro(bairro);
		hotel.setCidade(cidade);
		hotel.setEstado(estado);
		hotel.setDescricao(descricao);
		hotel.setClassificacao(Integer.parseInt(classificacao));
		hotel.setQtdquarto(Integer.parseInt(qtdquarto));
		hotel.setTipohotel(tipohotel);

		HotelDAO hdao = new HotelDAO();
		hdao.salvar(hotel);
		response.sendRedirect("hotelcontroller.do?action=list");
		}*/
	}
}
