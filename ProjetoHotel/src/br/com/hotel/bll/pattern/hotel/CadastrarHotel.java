package br.com.hotel.bll.pattern.hotel;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

public class CadastrarHotel implements InterfaceStrategyHotel {
	private static final String CADASTRARHOTEL = "hotelcontroller.do?action=LISTAR";
	HotelDAO hdao = new HotelDAO();
	EHotel hotel = new EHotel();
	public CadastrarHotel() {
	}
	
	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("txtcodhotel");
		if(id != ""){
			hotel.setCodhotel(Long.parseLong(request.getParameter("txtcodhotel")));
		}
		hotel.setNome(request.getParameter("txtnome"));
		hotel.setTelefone(request.getParameter("txttelefone"));
		hotel.setCep(request.getParameter("txtcep"));
		hotel.setEndereco(request.getParameter("txtendereco"));
		hotel.setBairro(request.getParameter("txtbairro"));
		hotel.setCidade(request.getParameter("txtcidade"));
		hotel.setEstado(request.getParameter("txtestado"));
		hotel.setDescricao(request.getParameter("txtdescricao"));
		hotel.setClassificacao(Integer.parseInt(request.getParameter("txtclassificacao")));
		hotel.setQtdquarto(Integer.parseInt(request.getParameter("txtqtdquarto")));
		hotel.setTipohotel(request.getParameter("txttipohotel"));
		hdao.salvar(hotel);
		try {
			response.sendRedirect(CADASTRARHOTEL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
