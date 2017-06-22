package br.com.hotel.bll.pattern.tipoquarto;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import br.com.hotel.dal.TipoQuartoDAO;
import br.com.hotel.model.ETipoQuarto;


public class ListarQuartoBusca implements InterfaceStrategyTipoQuarto {
	private static final String BUSCAQUARTOHOTEL = "resultadoQuartoBusca.jsp";
	TipoQuartoDAO persistencia = new TipoQuartoDAO();
	ETipoQuarto objeto = new ETipoQuarto();
	
	@Override
	public String acaoStrategy(HttpServletRequest request) {
		double valorDiaria;
		int codigo = Integer.parseInt(request.getParameter("codhotel"));
		int qtdDias = Integer.parseInt(request.getParameter("qtdDias"));
		List<ETipoQuarto> lista = new ArrayList<>();
		lista = persistencia.listarQuartos(codigo);
		//Calculando o valor da diaria
		for(int i = 0; i < lista.size(); i++){
			valorDiaria = lista.get(i).getValordiaria();
			//Formula : A Quantidade de dias * o valor da diaria
			lista.get(i).setValordiaria(valorDiaria * qtdDias);
		}
		request.setAttribute("quartos", lista);
		return BUSCAQUARTOHOTEL;
	}

}
