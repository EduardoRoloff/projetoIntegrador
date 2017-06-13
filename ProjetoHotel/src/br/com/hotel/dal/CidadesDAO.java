package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hotel.model.ECidades;
import br.com.hotel.util.Conexao;

public class CidadesDAO {
   
	private Connection connection;
	public CidadesDAO() {
		connection = Conexao.getConnection();
	}
	
	public List<ECidades> selecionaCidades(long codestado){
		String sql = "SELECT cidades.nome FROM cidades INNER JOIN estados ON (estados.id = cidades.estado_id) WHERE estados.id =?";
		List<ECidades> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, codestado);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ECidades cidade = new ECidades();
				cidade.setId(rs.getLong("id"));
				cidade.setNome(rs.getString("nome"));
				list.add(cidade);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
