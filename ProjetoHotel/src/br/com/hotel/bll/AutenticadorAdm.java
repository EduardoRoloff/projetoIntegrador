package br.com.hotel.bll;

import java.io.IOException;
//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Iterator;

import br.com.hotel.dal.AdminDAO;
import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EAdmistrador;
import br.com.hotel.model.EHotel;

/**
 * Servlet implementation class AutenticadorAdm
 */
@WebServlet("/autenticadoradm.do")
public class AutenticadorAdm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AutenticadorAdm() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession(false);
		if(sessao != null){
			sessao.invalidate();
		}
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("txtemail");
		String senha = request.getParameter("txtsenha");
			
		EAdmistrador adm = new EAdmistrador();
		adm.setLogin(login);
		adm.setSenha(senha);
		
		AdminDAO adao = new AdminDAO();
		EAdmistrador admReturn = adao.autenticar(adm);
		
		if(admReturn != null){		
			//cria a sessao
			HttpSession s = request.getSession();
			s.setMaxInactiveInterval(3000);
			s.setAttribute("adminLogado", admReturn);
/*--------------------------------------------------------------------			
			//Lista hoteis
			HotelDAO hdao = new HotelDAO();
			List<EHotel> listHotel = hdao.listarTodos();
			request.setAttribute("listHotel", listHotel);
*--------------------------------------------------------------------*/
			HotelDAO hdao = new HotelDAO();
			Iterator<EHotel> listHotel =  hdao.listarTodos();
			request.setAttribute("listHotel", listHotel);
			request.getRequestDispatcher("logado-admsystem.jsp").forward(request, response);	
		}else{
			response.sendRedirect("login-admsystem.jsp");
		}
		
	}

}
