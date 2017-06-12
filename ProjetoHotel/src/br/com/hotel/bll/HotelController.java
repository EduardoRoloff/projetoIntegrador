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

		HotelDAO hdao = null;
		EHotel hotel = null;
		String action = request.getParameter("action");
		
		

		 if (action != null && action.equals("i")) {
			
			
		 
		 }else if (action != null && action.equals("del")) {
			
			String codhotel = request.getParameter("txtcodhotel");
			hdao = new HotelDAO();
			hotel = new EHotel();
			hotel.setCodhotel(Long.parseLong(codhotel));
			hdao.deletar(hotel);
			response.sendRedirect("hotelcontroller.do?action=list");
			
		} else if (action != null && action.equals("update")) {
			
			String codhotel = request.getParameter("txtcodhotel");
			hdao = new HotelDAO();
			hotel = hdao.pesquisarHotelCod(Long.parseLong(codhotel));

			request.setAttribute("hotel", hotel);
			RequestDispatcher rd = request.getRequestDispatcher("newcadastroHotel.jsp");
			rd.forward(request, response);

		} else if (action != null && action.equals("list")) {
/*
			hdao = new HotelDAO();
			List<EHotel> listHotel = hdao.listarTodos();
*/			
			hdao = new HotelDAO();
			Iterator<EHotel> listHotel =  hdao.listarTodos();
			request.setAttribute("listHotel", listHotel);

			RequestDispatcher rd = request.getRequestDispatcher("logado-admsystem.jsp");
			rd.forward(request, response);

		} else if (action != null && action.equals("new")) {
			hotel = new EHotel();
			hotel.setNome("");
			hotel.setRua("");
			hotel.setQuadra("");
			hotel.setLote("");
			hotel.setBairro("");
			hotel.setDescricao("");
			hotel.setNumero("");
			request.setAttribute("hotel", hotel);
			RequestDispatcher rd = request.getRequestDispatcher("newcadastroHotel.jsp");
			rd.forward(request, response);
			
		} else if (action != null && action.equals("view")) {

			String codhotel = request.getParameter("txtcodhotel");

			hdao = new HotelDAO();
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
		/*
		if(request.getParameter("txtpeq").equals("pesq")){
			
			HotelDAO hdao = null;
			EHotel hotel = null;
			 String nome = request.getParameter("data");
			 hdao = new HotelDAO();
			EHotel listHotel =  hdao.pesquisarHotelNome(nome);
			request.setAttribute("listHotel", listHotel);

				RequestDispatcher rd = request.getRequestDispatcher("logado-admsystem.jsp");
				rd.forward(request, response);
			
		}else if(request.getParameter("txtsalvar").equals("salvar")){
	*/		
		String id = request.getParameter("txtcodhotel");
		String nome = request.getParameter("txtnome");
		String rua = request.getParameter("txtrua");
		String quadra = request.getParameter("txtquadra");
		String lote = request.getParameter("txtlote");
		String bairro = request.getParameter("txtbairro");
		String descricao = request.getParameter("txtdescricao");
		String classificacao = request.getParameter("txtclassificacao");
		String numero = request.getParameter("txtnumero");
		String qtdquarto = request.getParameter("txtqtdquarto");
		String tipohotel = request.getParameter("txttipohotel");
		String telefone = request.getParameter("txttelefone");
		String cep = request.getParameter("txtcep");
		
		EHotel hotel = new EHotel();
		if(id != ""){
			hotel.setCodhotel(Long.parseLong(id));
		}

		hotel.setNome(nome);
		hotel.setRua(rua);
		hotel.setQuadra(quadra);
		hotel.setLote(lote);
		hotel.setBairro(bairro);
		hotel.setDescricao(descricao);
		hotel.setClassificacao(Integer.parseInt(classificacao));
		hotel.setNumero(numero);
		hotel.setQtdquarto(Integer.parseInt(qtdquarto));
		hotel.setTipohotel(tipohotel);
		hotel.setTelefone(telefone);
		hotel.setCep(cep);

		HotelDAO hdao = new HotelDAO();
		hdao.salvar(hotel);
		response.sendRedirect("hotelcontroller.do?action=list");
		}
	

}
