package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hotel.model.EPagamento;
import br.com.hotel.util.Conexao;

public class PagamentoDAO {
	
	private Connection connection;
	
	public PagamentoDAO(){
		connection = Conexao.getConnection();
	}
	
	/*public long Inserir(EPagamento objeto) {
		
		String sql = "INSERT INTO reserva (dataentrada,datasaida,codtipoquarto, codcliente) "
				+ "values (?,?,?,?) RETURNING codreserva ";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, dataentrada);
			ps.setString(2, datasaida);
			ps.setLong(3, codtipo);
			ps.setLong(4, codcliente);
			ResultSet rs = ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (Long) null;
	}*/
	
	
}
