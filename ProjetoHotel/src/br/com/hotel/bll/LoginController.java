package br.com.hotel.bll;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;

import br.com.hotel.dal.PCliente;
import br.com.hotel.model.ECliente;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	PCliente persistencia = new PCliente();
	private static String HOME = "/index.jsp";
	private static String LOGIN = "/login.jsp";
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forward="";
		String funcao = request.getParameter("action");
		
		if(funcao.equals("login")){
			forward = LOGIN;
		}
		if(funcao.equals("index")){
			forward = HOME;
		}
		if(funcao.equals("logout")){
			HttpSession sessao = request.getSession();
			sessao.invalidate();
			forward = HOME;
			System.out.println("Encerrei a sessão!");
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
	    view.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String forward="";
		ECliente objeto = new ECliente();
		objeto.setEmail(request.getParameter("email"));
		objeto.setSenha(request.getParameter("senha"));
		
		if(request.getParameter("action").equals("login")){
			try {
				if(persistencia.verificarUsuario(objeto)){
					forward = HOME;
					HttpSession sessao = request.getSession();
					sessao.setAttribute("usuario", persistencia.consultar(objeto));
				}
				else{
					forward = LOGIN;
					request.setAttribute("error", "Login Inválido!");
				}
			}catch(SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response); 
	}
}
