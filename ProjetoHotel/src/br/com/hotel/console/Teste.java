package br.com.hotel.console;

import java.sql.SQLException;

import br.com.hotel.bll.LocacaoController;
import br.com.hotel.dal.LocacaoDAO;

public class Teste {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub 
		LocacaoDAO persis = new LocacaoDAO();
		
		Long codigo = persis.ConsultarPorCodigo(1);
		System.out.println("cODIGO" + codigo);
		
		long valor = persis.Inserir("2017-06-07", "2017-06-02", 9, 2);
		System.out.println("Valor: " + valor);
	}

}
