package br.com.hotel.bll.pattern.tipoquarto;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.TipoQuartoDAO;
import br.com.hotel.model.ETipoQuarto;

public class SalvarTipoQuarto implements InterfaceStrategyTipoQuarto{

	private static final String HOME = "hotelcontroller.do?action=LISTAR";
	ETipoQuarto tipoQuarto = new ETipoQuarto();
	TipoQuartoDAO quartoDao = new TipoQuartoDAO();
	public SalvarTipoQuarto() {
	}
	
	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response){
		tipoQuarto.setNome(request.getParameter("txtnome"));
		tipoQuarto.setQuantidadequarto(Integer.parseInt(request.getParameter("txtqtquarto")));
		tipoQuarto.setQuantidadecama(Integer.parseInt(request.getParameter("txtqtcama")));
		tipoQuarto.setQuantidadepessoa(Integer.parseInt(request.getParameter("txtqtpessoas")));
		tipoQuarto.setValordiaria(Double.parseDouble(request.getParameter("txtvalor")));
		tipoQuarto.setDescricao(request.getParameter("txtdescricao"));
		tipoQuarto.getHotel().setCodhotel(Long.parseLong(request.getParameter("txtcodhotel")));
		quartoDao.cadastrar(tipoQuarto);
		RequestDispatcher view = request.getRequestDispatcher(HOME);
	    try {
			view.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
