package br.com.hotel.bll;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.EstadosDAO;
import br.com.hotel.model.EEstados;

/**
 * Servlet implementation class EstadosController
 */
@WebServlet("/estadoscontroller.do")
public class EstadosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EstadosController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			EstadosDAO edao = null;
			EEstados estado = null;
			String action = request.getParameter("action");
			
			if(action != null && action.equals("list")){
				edao = new EstadosDAO();
				List<EEstados> list = edao.listarTodos();
				request.setAttribute("list", list);
				RequestDispatcher rd = request.getRequestDispatcher("localizacaoHotel.jsp");
				rd.forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
