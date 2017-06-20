package br.com.hotel.bll.pattern.hotel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface InterfaceStrategyHotel {

	public void acaoStrategy(HttpServletRequest request,HttpServletResponse response);
}
