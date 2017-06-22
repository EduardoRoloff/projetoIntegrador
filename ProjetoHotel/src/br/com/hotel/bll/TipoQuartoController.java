package br.com.hotel.bll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.bll.pattern.tipoquarto.EnumFactoryTipoQuarto;
import br.com.hotel.bll.pattern.tipoquarto.InterfaceStrategyTipoQuarto;
/**
 * Servlet implementation class QuartoController
 */
@WebServlet("/quartocontroller.do")
public class TipoQuartoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TipoQuartoController() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String funcao = request.getParameter("action");
		InterfaceStrategyTipoQuarto strategy = EnumFactoryTipoQuarto.valueOf(funcao).obterAcao();
		strategy.acaoStrategy(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String funcao = request.getParameter("btnsalvar");
		InterfaceStrategyTipoQuarto strategy = EnumFactoryTipoQuarto.valueOf(funcao).obterAcao();
		strategy.acaoStrategy(request, response);
	}
}
