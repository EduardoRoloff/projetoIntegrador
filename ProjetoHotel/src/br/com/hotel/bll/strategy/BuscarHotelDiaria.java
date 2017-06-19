package br.com.hotel.bll.strategy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import br.com.hotel.dal.HotelDAO;
import br.com.hotel.model.EHotel;

public class BuscarHotelDiaria implements InterfaceStrategyTipoQuarto{
	private static final String BUSCARHOTEL = "newcadastroTipoQuarto.jsp";
	HotelDAO persistencia = new HotelDAO();
	
	public BuscarHotelDiaria() {
	}

	@Override
	public String acaoQuarto(HttpServletRequest request) {
		double valorDiaria;
		String entrada = request.getParameter("CheckIn");
		String vetorEntrada[] = entrada.split("-");
		String saida = request.getParameter("CheckOut");
		String vetorSaida[] = saida.split("-");
		LocalDate dataEntrada = LocalDate.of(Integer.parseInt(vetorEntrada[0]), Integer.parseInt(vetorEntrada[1]), Integer.parseInt(vetorEntrada[2]));
		LocalDate dataSaida = LocalDate.of(Integer.parseInt(vetorSaida[0]), Integer.parseInt(vetorSaida[1]), Integer.parseInt(vetorSaida[2]));
		long diferencaDias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
		System.out.printf("Dias: " + diferencaDias);
		try {
		    List<EHotel> lista = new ArrayList<>();
			lista = persistencia.pesquisarHotelCidade(request.getParameter("Destination1Text"));
			for (int i = 0; i < lista.size(); i++) {
				valorDiaria = lista.get(i).getPrecoDiaria();
				lista.get(i).setPrecoDiaria(valorDiaria * diferencaDias);
				System.out.println("Valor diarias: " + lista.get(i).getPrecoDiaria());
			}
			request.setAttribute("hoteis", lista);
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return BUSCARHOTEL;
	}

}
