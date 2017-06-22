package br.com.hotel.bll.pattern.locacao;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;


import br.com.hotel.model.ECliente;

public class EfetuarLocacao implements InterfaceStrategyLocacao {

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("Cod quarto: " + request.getParameter("codigoQuarto"));
		System.out.println("Valor Diaria: " + request.getParameter("valorDiaria"));
		HttpSession sessao = request.getSession();
		ECliente cliente = new ECliente();
		cliente = (ECliente) sessao.getAttribute("usuario");
		System.out.println("Cod Cliente: " + cliente.getCodcliente());
		String dataEntrada = "";
		String dataSaida = "";
		Cookie[] cookies = request.getCookies();
	    for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if(cookie.getName().equalsIgnoreCase("dataEntrada")){
				dataEntrada = cookie.getValue();
			}
			if(cookie.getName().equalsIgnoreCase("dataSaida")){
				dataSaida = cookie.getValue();
			}
		}
	}
}
