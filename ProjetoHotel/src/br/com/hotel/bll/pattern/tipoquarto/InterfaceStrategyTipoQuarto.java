package br.com.hotel.bll.pattern.tipoquarto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InterfaceStrategyTipoQuarto {

	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response);
}
