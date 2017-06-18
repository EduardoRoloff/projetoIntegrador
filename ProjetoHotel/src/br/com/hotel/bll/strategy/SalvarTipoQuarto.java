package br.com.hotel.bll.strategy;

import javax.servlet.http.HttpServletRequest;

import br.com.hotel.dal.QuartoDAO;
import br.com.hotel.model.EQuarto;

public class SalvarTipoQuarto implements InterfaceStrategyQuarto{

	private static final String HOME = "/logado-admsystem.jsp";
	EQuarto tipoQuarto = new EQuarto();
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
