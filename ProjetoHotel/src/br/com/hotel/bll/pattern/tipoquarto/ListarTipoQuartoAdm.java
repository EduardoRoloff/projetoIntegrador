package br.com.hotel.bll.pattern.tipoquarto;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.dal.TipoQuartoDAO;
import br.com.hotel.model.ETipoQuarto;

public class ListarTipoQuartoAdm implements InterfaceStrategyTipoQuarto{
	private static final String REDIRECT = "listaTipoQuarto.jsp";
	ETipoQuarto tipoQuarto = new ETipoQuarto();
	TipoQuartoDAO quartoDao = new TipoQuartoDAO();
	public ListarTipoQuartoAdm() {
	}

	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		long codhotel = Long.parseLong(request.getParameter("data"));
		Iterator<ETipoQuarto> listaQuarto =  quartoDao.listarTipoQuartoAdm(codhotel);
		if(listaQuarto.hasNext()){	
			request.setAttribute("listaQuarto", listaQuarto);
			RequestDispatcher rd = request.getRequestDispatcher(REDIRECT);
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			try {
				response.sendRedirect("listaTipoQuarto.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
