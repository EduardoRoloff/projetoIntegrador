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
	
public void Inserir(EPagamento objeto) {
		
		String sql = "INSERT INTO pagamento (nrocartao, bandeira, datapagamento, valorreserva, codigoseguranca, mesvencimentocartao, anovencimento, cpf, codclientep, codreserva, nomenocartao) "
				+ "values(?, ?, CURRENT_TIMESTAMP, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, objeto.getNrocartao());
			ps.setString(2, objeto.getBandeira());
			ps.setDouble(3, objeto.getValorreserva());
			ps.setLong(4, objeto.getCodigoseguranca());
			ps.setString(5, objeto.getMesvencimentocartao());
			ps.setString(6, objeto.getAnovencimento());
			ps.setString(7, objeto.getCpf());
			ps.setLong(8, objeto.getCliente().getCodcliente());
			ps.setLong(9, objeto.getLocacao().getCodreserva());
			ps.setString(10, objeto.getNomenocartao());
			//System.out.println("SQL: " + ps.toString());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
