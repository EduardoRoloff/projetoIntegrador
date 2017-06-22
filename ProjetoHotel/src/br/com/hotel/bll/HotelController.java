package br.com.hotel.bll;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.bll.pattern.hotel.EnumFactoryHotel;
import br.com.hotel.bll.pattern.hotel.InterfaceStrategyHotel;
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
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String funcao = request.getParameter("action");
		InterfaceStrategyHotel strategy = EnumFactoryHotel.valueOf(funcao).obterAcao();
		strategy.acaoStrategy(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String funcao = request.getParameter("btnacao");
		InterfaceStrategyHotel strategy = EnumFactoryHotel.valueOf(funcao).obterAcao();
		strategy.acaoStrategy(request, response);
	}
}
