package br.com.hotel.bll.strategy;

import javax.servlet.http.HttpServletRequest;

import br.com.hotel.dal.HotelDAO;

public class CadastrarQuarto implements InterfaceStrategyQuarto{
	private static final String CADASTRARTIPOQUARTO = "/newcadastroQuarto.jsp";
	HotelDAO hoteldao = new HotelDAO();
	public CadastrarQuarto(){}
	
	@Override
	public String acaoQuarto(HttpServletRequest request) {
		String codhotel = request.getParameter("txtcodhotel");
		request.setAttribute("hotel", hoteldao.pesquisarHotelCod(Long.parseLong(codhotel)));
		return CADASTRARTIPOQUARTO;
	}
	
}
