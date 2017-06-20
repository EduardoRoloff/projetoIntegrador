package br.com.hotel.bll.pattern.hotel;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

public class ListarHotel implements InterfaceStrategyHotel {
	private static final String REDIRECT = "logado-admsystem.jsp";
	HotelDAO hdao = new HotelDAO();
	EHotel hotel = new EHotel();
	public ListarHotel() {
	}
	
	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		Iterator<EHotel> listHotel =  hdao.listarTodos();
		request.setAttribute("listHotel", listHotel);
		RequestDispatcher rd = request.getRequestDispatcher(REDIRECT);
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
