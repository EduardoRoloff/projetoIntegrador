package br.com.hotel.bll.pattern.hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

public class AtualizarHotel implements InterfaceStrategyHotel{
	private static final String DISPATCHER = "newcadastroHotel.jsp";
	HotelDAO hdao = new HotelDAO();
	EHotel hotel = new EHotel();
	public AtualizarHotel() {
	}

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		String codhotel = request.getParameter("txtcodhotel");
		hotel = hdao.pesquisarHotelCod(Long.parseLong(codhotel));
		request.setAttribute("hotel", hotel);
		RequestDispatcher rd = request.getRequestDispatcher(DISPATCHER);
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
