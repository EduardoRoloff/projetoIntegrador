package br.com.hotel.bll.pattern.hotel;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

public class BuscarHotelDiaria implements InterfaceStrategyHotel{
	private static final String BUSCARHOTEL = "resultadoBusca.jsp";
	HotelDAO persistencia = new HotelDAO();
	public BuscarHotelDiaria() {
	}

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		//Separando dados das datas inseridas pelo usuário
		String entrada = request.getParameter("CheckIn");
		String vetorEntrada[] = entrada.split("-");
		String saida = request.getParameter("CheckOut");
		String vetorSaida[] = saida.split("-");
		
		//Adiciono o cookie e redireciono para a página de reserva
		Cookie cookieDtEntrada = new Cookie("dataEntrada", entrada);
		Cookie cookieDtSaida = new Cookie("dataSaida", saida);
		response.addCookie(cookieDtEntrada);
		response.addCookie(cookieDtSaida);
		
		//Convertendo as datas e pegando apenas as diferenças em dias
		LocalDate dataEntrada = LocalDate.of(Integer.parseInt(vetorEntrada[0]), Integer.parseInt(vetorEntrada[1]), Integer.parseInt(vetorEntrada[2]));
		LocalDate dataSaida = LocalDate.of(Integer.parseInt(vetorSaida[0]), Integer.parseInt(vetorSaida[1]), Integer.parseInt(vetorSaida[2]));
		long diferencaDias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
		
		//Passo para a busca de quarto a quantidade em dias para efetuar calculo de valor 
		try {
		    List<EHotel> lista = new ArrayList<>();
			lista = persistencia.pesquisarHotelCidade(request.getParameter("Destination1Text"));
			for (int i = 0; i < lista.size(); i++) {
				lista.get(i).setQtdDias(diferencaDias);
			}
			//Redireciono tanto quanto o request mas também o response que no caso vem os cookies também
			request.setAttribute("hoteis", lista);
			RequestDispatcher view = request.getRequestDispatcher(BUSCARHOTEL);
			view.forward(request, response);
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
