package br.com.hotel.bll.pattern.tipoquarto;

import javax.servlet.http.HttpServletRequest;

import br.com.hotel.dal.HotelDAO;

public class CadastrarTipoQuarto implements InterfaceStrategyTipoQuarto{
	private static final String CADASTRARTIPOQUARTO = "newcadastroTipoQuarto.jsp";
	HotelDAO hoteldao = new HotelDAO();
	public CadastrarTipoQuarto(){}
	
	@Override
	public String acaoStrategy(HttpServletRequest request) {
		String codhotel = request.getParameter("txtcodhotel");
		request.setAttribute("hotel", hoteldao.pesquisarHotelCod(Long.parseLong(codhotel)));
		return CADASTRARTIPOQUARTO;
	}
	
}
