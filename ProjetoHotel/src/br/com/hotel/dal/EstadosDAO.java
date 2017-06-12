package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hotel.model.EEstados;
import br.com.hotel.model.EHotel;
import br.com.senai.util.Conexao;

public class EstadosDAO {
	
	private Connection connection;

	public EstadosDAO() {
		connection = Conexao.getConnection();
	}
	
		public List<EEstados> listarTodos() {
			String sql = "SELECT * FROM estados";
			List<EEstados> list = new ArrayList<>();

			try {
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					EEstados estado = new EEstados();
					estado.setId(rs.getLong("id"));
					estado.setNome(rs.getString("nome"));
					estado.setSigla(rs.getString("sigla"));
					list.add(estado);
				} 
				ps.close();

			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return list;
		}// # listarTodos
		

}
