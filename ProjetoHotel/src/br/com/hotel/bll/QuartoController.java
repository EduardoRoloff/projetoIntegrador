package br.com.hotel.bll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.bll.strategy.InterfaceStrategyQuarto;
import br.com.hotel.bll.strategy.RequisicaoQuartoController;
import br.com.hotel.dal.HotelDAO;
import br.com.hotel.dal.QuartoDAO;
import br.com.hotel.model.EQuarto;

/**
 * Servlet implementation class QuartoController
 */
@WebServlet("/quartocontroller.do")
public class QuartoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String HOME = "index.jsp";
    QuartoDAO quartodao = new QuartoDAO();
    HotelDAO hoteldao = new HotelDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuartoController() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String funcao = request.getParameter("action");
		
		RequisicaoQuartoController requisicao = RequisicaoQuartoController.valueOf(funcao);
		InterfaceStrategyQuarto strategy = requisicao.obterAcao();
		
		forward = strategy.acaoQuarto(request);
		RequestDispatcher view = request.getRequestDispatcher(forward);
	    view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String funcao = request.getParameter("btnsalvar");
		
		RequisicaoQuartoController requisicao = RequisicaoQuartoController.valueOf(funcao);
		InterfaceStrategyQuarto strategy = requisicao.obterAcao();
		
		response.sendRedirect(strategy.acaoQuarto(request));
	}

}
