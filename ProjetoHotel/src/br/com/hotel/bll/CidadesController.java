package br.com.hotel.bll;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.CidadesDAO;
import br.com.hotel.model.ECidades;

/**
 * Servlet implementation class CidadesController
 */
@WebServlet("/cidadescontroller.do")
public class CidadesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CidadesController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CidadesDAO cdao = null;
		ECidades cidade = null;
		String action = request.getParameter("action");
		
		if(action != null && action.equals("list")){
			String id = request.getParameter("txtid");
			cdao = new CidadesDAO();
			List<ECidades> list = cdao.selecionaCidades(Long.parseLong(id));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
