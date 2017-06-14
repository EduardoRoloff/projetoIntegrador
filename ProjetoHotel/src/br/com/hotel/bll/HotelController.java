package br.com.hotel.bll;

import java.io.IOException;
import java.util.Iterator;
//import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

/**
 * Servlet implementation class HotelController
 */
@WebServlet("/hotelcontroller.do")
public class HotelController extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		
		String id = request.getParameter("txtcodhotel");
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
		}
}
