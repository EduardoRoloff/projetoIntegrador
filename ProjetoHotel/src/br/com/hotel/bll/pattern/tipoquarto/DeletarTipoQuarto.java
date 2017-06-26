package br.com.hotel.bll.pattern.tipoquarto;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.TipoQuartoDAO;
import br.com.hotel.model.ETipoQuarto;

public class DeletarTipoQuarto implements InterfaceStrategyTipoQuarto{
	private static final String DELETAR = "listaTipoQuarto.jsp";
	ETipoQuarto tipoquarto = new ETipoQuarto();
	TipoQuartoDAO tipodao = new TipoQuartoDAO();
	public DeletarTipoQuarto() {
	}

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		String codhotel = request.getParameter("txtcodtipo");
		tipoquarto.setCodtipo(Long.parseLong(codhotel));
		tipodao.deletarTipoQuartoCod(tipoquarto);
		try {
			response.sendRedirect(DELETAR);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
