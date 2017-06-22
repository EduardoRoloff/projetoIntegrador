package br.com.hotel.bll.pattern.locacao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.hotel.dal.TipoQuartoDAO;
import br.com.hotel.model.ETipoQuarto;

public class VisualizarLocacao implements InterfaceStrategyLocacao {
	private static final String LOGIN = "login.jsp";
	private static final String RESERVA = "efetuarLocacao.jsp";
	TipoQuartoDAO persistencia = new TipoQuartoDAO();
    
	
	@Override
	public void acaoStrategy(HttpServletRequest request, HttpServletResponse response) {
		String forward = "";
		long codigoHotel = Long.parseLong(request.getParameter("codhotel"));
		long codigoTipo = Long.parseLong(request.getParameter("codtipo"));
		double valorDiaria = Double.parseDouble(request.getParameter("valorDiaria"));
		HttpSession session = request.getSession();
		//Caso usuário não esteja logado
		if(session.getAttribute("usuario") == null){
			
			ETipoQuarto objeto = persistencia.mostrarDetalhesQuarto(codigoHotel, codigoTipo);
			objeto.setValordiaria(valorDiaria);
			
			Cookie cookieCodTipo = null;
			Cookie cookieNomeTipo = null;
			Cookie cookieDescricao = null;
			Cookie cookieQtdCama = null; 
			Cookie cookieQtdPessoa = null; 
			Cookie cookieCodHotel = null; 
			Cookie cookieNomeHotel = null; 
			Cookie cookieEnderecoHotel = null; 
			Cookie cookieTelefoneHotel = null;
			 
			try {
				cookieCodTipo = new Cookie("codTipo", URLEncoder.encode(String.valueOf(objeto.getCodtipo()), "UTF-8"));
				cookieNomeTipo = new Cookie("nomeTipo", URLEncoder.encode(objeto.getNome(), "UTF-8"));
				cookieDescricao = new Cookie("descricao", URLEncoder.encode(objeto.getDescricao(), "UTF-8"));
				cookieQtdCama = new Cookie("qtdCama", URLEncoder.encode(String.valueOf(objeto.getQuantidadecama()), "UTF-8"));
				cookieQtdPessoa = new Cookie("qtdPessoas", URLEncoder.encode(String.valueOf(objeto.getQuantidadepessoa()), "UTF-8"));
				cookieCodHotel = new Cookie("codHotel", URLEncoder.encode(String.valueOf(objeto.getHotel().getCodhotel()), "UTF-8"));
				cookieNomeHotel = new Cookie("nomeHotel", URLEncoder.encode(objeto.getHotel().getNome(), "UTF-8"));
				cookieEnderecoHotel = new Cookie("enderecoHotel", URLEncoder.encode(objeto.getHotel().getEndereco(), "UTF-8"));
				cookieTelefoneHotel = new Cookie("telefoneHotel", URLEncoder.encode(objeto.getHotel().getTelefone(), "UTF-8"));
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Adiciona os Cookies no response
			response.addCookie(cookieCodTipo);
			response.addCookie(cookieNomeTipo);
			response.addCookie(cookieDescricao);
			response.addCookie(cookieQtdCama);        
			response.addCookie(cookieQtdPessoa);
			response.addCookie(cookieCodHotel);
			response.addCookie(cookieNomeHotel);
			response.addCookie(cookieEnderecoHotel);
			response.addCookie(cookieTelefoneHotel);
			
			forward = LOGIN;
		//Usuário já cadastrado
		}else{
			ETipoQuarto detalheQuarto = new ETipoQuarto();
			detalheQuarto = persistencia.mostrarDetalhesQuarto(codigoHotel, codigoTipo);
			detalheQuarto.setValordiaria(valorDiaria);
			request.setAttribute("detalheslocacao", detalheQuarto);
			forward = RESERVA;
		}
				RequestDispatcher view = request.getRequestDispatcher(forward);
			try {
				view.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
