package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hotel.model.ELocacao;
import br.com.hotel.util.Conexao;

public class LocacaoDAO {
	private Connection connection;
	
	public LocacaoDAO() {
		connection = Conexao.getConnection();
	}
	
	public long Inserir(String dataentrada, String datasaida, long codtipo, long codcliente) {
		
		String sql = "INSERT INTO reserva (dataentrada,datasaida,codtipoquarto, codcliente) "
				+ "values (?,?,?,?) RETURNING codreserva ";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, dataentrada);
			ps.setString(2, datasaida);
			ps.setLong(3, codtipo);
			ps.setLong(4, codcliente);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				
				return ConsultarPorCodigo(rs.getLong("codreserva"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (Long) null;
	}
	
	public long ConsultarPorCodigo(long codreserva) throws SQLException{
		long codigo = 0;
		String sql = "SELECT * from reserva "
				+ "WHERE codreserva = ? ";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setLong(1, codreserva);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			codigo = rs.getLong("codreserva");
		}
		
		return codigo;
	}
}
