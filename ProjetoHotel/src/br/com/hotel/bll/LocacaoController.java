package br.com.hotel.bll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.hotel.bll.pattern.locacao.EnumFactoryLocacao;
import br.com.hotel.bll.pattern.locacao.InterfaceStrategyLocacao;
import br.com.hotel.bll.pattern.tipoquarto.EnumFactoryTipoQuarto;
import br.com.hotel.bll.pattern.tipoquarto.InterfaceStrategyTipoQuarto;

/**
 * Servlet implementation class LocacaoController
 */
@WebServlet("/locacaocontroller")
public class LocacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LocacaoController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String funcao = request.getParameter("action");
		
		InterfaceStrategyLocacao strategy = EnumFactoryLocacao.valueOf(funcao).obterAcao();
		strategy.acaoStrategy(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
