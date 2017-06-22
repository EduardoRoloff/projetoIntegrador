package br.com.hotel.bll.pattern.locacao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InterfaceStrategyLocacao {
	public void acaoStrategy(HttpServletRequest request,HttpServletResponse response);
}
