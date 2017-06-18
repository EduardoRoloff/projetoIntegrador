package br.com.hotel.bll.strategy;

import javax.servlet.http.HttpServletRequest;

import br.com.hotel.dal.QuartoDAO;
import br.com.hotel.model.ETipoQuarto;

public class SalvarTipoQuarto implements InterfaceStrategyTipoQuarto{

	private static final String HOME = "hotelcontroller.do?action=list";
	ETipoQuarto tipoQuarto = new ETipoQuarto();
	QuartoDAO quartoDao = new QuartoDAO();
	
	public SalvarTipoQuarto() {
	}
	
	@Override
	public String acaoQuarto(HttpServletRequest request){
		tipoQuarto.setNome(request.getParameter("txtnome"));
		tipoQuarto.setQuantidadecama(Integer.parseInt(request.getParameter("txtqtcama")));
		tipoQuarto.setQuantidadepessoa(Integer.parseInt(request.getParameter("txtqtpessoas")));
		tipoQuarto.setValordiaria(Double.parseDouble(request.getParameter("txtvalor")));
		tipoQuarto.setDescricao(request.getParameter("txtdescricao"));
		tipoQuarto.getHotel().setCodhotel(Long.parseLong(request.getParameter("txtcodhotel")));
		quartoDao.cadastrar(tipoQuarto);
		return HOME;
	}
}
