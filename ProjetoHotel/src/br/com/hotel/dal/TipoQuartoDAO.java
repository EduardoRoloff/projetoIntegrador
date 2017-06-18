package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hotel.model.ETipoQuarto;
import br.com.hotel.util.Conexao;

public class TipoQuartoDAO {

	private Connection connection;
	public TipoQuartoDAO() {
		connection = Conexao.getConnection();
	}
	
	public void cadastrar(ETipoQuarto quarto){
		String sql = "INSERT INTO tipoquarto (nome, quantidadequarto, quantidadecama, quantidadepessoa, valordiaria, descricao, codhotel) values (?,?,?,?,?,?,?)";
		try{
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, quarto.getNome());
			pst.setInt(2, quarto.getQuantidadequarto());
			pst.setInt(3, quarto.getQuantidadecama());
			pst.setInt(4, quarto.getQuantidadepessoa());
			pst.setDouble(5, quarto.getValordiaria());
			pst.setString(6, quarto.getDescricao());
			pst.setLong(7, quarto.getHotel().getCodhotel());
			pst.execute();
			pst.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}//#cadastrar
	
	

}
