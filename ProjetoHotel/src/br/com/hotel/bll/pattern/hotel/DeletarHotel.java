package br.com.hotel.bll.pattern.hotel;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.dal.TipoQuartoDAO;
import br.com.hotel.model.EHotel;

public class DeletarHotel implements InterfaceStrategyHotel{
	private static final String REDIRECT = "hotelcontroller.do?action=LISTAR";
	HotelDAO hdao = new HotelDAO();
	TipoQuartoDAO tdao = new TipoQuartoDAO();
	EHotel hotel = new EHotel();
	public DeletarHotel() {
	}

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		String codhotel = request.getParameter("txtcodhotel");
		hotel.setCodhotel(Long.parseLong(codhotel));
		tdao.deletarTipoQuarto(hotel);
		hdao.deletar(hotel);
		try {
			response.sendRedirect(REDIRECT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
