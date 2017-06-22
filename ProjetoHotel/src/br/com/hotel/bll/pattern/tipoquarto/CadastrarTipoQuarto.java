package br.com.hotel.bll.pattern.tipoquarto;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.HotelDAO;

public class CadastrarTipoQuarto implements InterfaceStrategyTipoQuarto{
	private static final String CADASTRARTIPOQUARTO = "newcadastroTipoQuarto.jsp";
	HotelDAO hoteldao = new HotelDAO();
	public CadastrarTipoQuarto(){}
	
	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		String codhotel = request.getParameter("txtcodhotel");
		request.setAttribute("hotel", hoteldao.pesquisarHotelCod(Long.parseLong(codhotel)));
		try {
			response.sendRedirect(CADASTRARTIPOQUARTO);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
