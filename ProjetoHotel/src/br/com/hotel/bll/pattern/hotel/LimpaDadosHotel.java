package br.com.hotel.bll.pattern.hotel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

public class LimpaDadosHotel implements InterfaceStrategyHotel{
	private static final String REDIRECT = "newcadastroHotel.jsp";
	HotelDAO hdao = new HotelDAO();
	EHotel hotel = new EHotel();
	public LimpaDadosHotel() {
	}

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
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
