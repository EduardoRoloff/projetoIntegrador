package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hotel.model.ETipoQuarto;
import br.com.hotel.util.Conexao;

public class QuartoDAO {

	private Connection connection;
	public QuartoDAO() {
		connection = Conexao.getConnection();
	}
	
	public void cadastrar(ETipoQuarto quarto){
		String sql = "INSERT INTO tipoquarto (nome, quantidadecama, quantidadepessoa, valordiaria, descricao, codhotel) values (?,?,?,?,?,?)";
		try{
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, quarto.getNome());
			pst.setInt(2, quarto.getQuantidadecama());
			pst.setInt(3, quarto.getQuantidadepessoa());
			pst.setDouble(4, quarto.getValordiaria());
			pst.setString(5, quarto.getDescricao());
			pst.setLong(6, quarto.getHotel().getCodhotel());
			pst.execute();
			pst.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}//#cadastrar
	
	

}
