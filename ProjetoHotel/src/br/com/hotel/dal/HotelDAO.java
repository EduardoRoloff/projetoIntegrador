package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.hotel.model.EHotel;
import br.com.hotel.util.Conexao;

public class HotelDAO {

	private Connection connection;
	public HotelDAO() {
		connection = Conexao.getConnection();
	}
	
	public void salvar(EHotel h){
		if(h.getCodhotel() != 0)
			alterar(h);
		else
			cadastrar(h);
	}

	public void cadastrar(EHotel h) {
		String sql = "INSERT INTO hotel (nome,rua,quadra,lote, bairro, descricao, classificacao, numero, foto, qtdquarto,tipohotel,telefone,cep) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, h.getNome());
			ps.setString(2, h.getRua());
			ps.setString(3, h.getQuadra());
			ps.setString(4, h.getLote());
			ps.setString(5, h.getBairro());
			ps.setString(6, h.getDescricao());
			ps.setInt   (7, h.getClassificacao());
			ps.setString(8, h.getNumero());
			ps.setString(9, h.getFoto());
			ps.setInt   (10,h.getQtdquarto());
			ps.setString(11, h.getTipohotel());
			ps.setString(12, h.getTelefone());
			ps.setString(13, h.getCep());
			//ps.setLong  (11,h.getCidade().getId());
			//ps.setLong  (12,h.getCidade().getEstado().getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// fim do metodo cadastrar

	public void alterar(EHotel h) {
		String sql = "UPDATE hotel SET nome=?,rua=?,quadra=?,lote=?,bairro=?,descricao=?,"
				+ " classificacao=?,numero=?,foto=?,qtdquarto=?,tipohotel=?,telefone=?,cep=? WHERE codhotel=?";

		try {
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, h.getNome());
			ps.setString(2, h.getRua());
			ps.setString(3, h.getQuadra());
			ps.setString(4, h.getLote());
			ps.setString(5, h.getBairro());
			ps.setString(6, h.getDescricao());
			ps.setInt   (7, h.getClassificacao());
			ps.setString(8, h.getNumero());
			ps.setString(9, h.getFoto());
			ps.setInt   (10,h.getQtdquarto());
			ps.setString(11, h.getTipohotel());
			ps.setString(12, h.getTelefone());
			ps.setString(13, h.getCep());
			ps.setLong(14, h.getCodhotel());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// fim do metodo alterar

	public void deletar(EHotel h) {
		String sql = "DELETE FROM hotel WHERE codhotel=?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setLong(1, h.getCodhotel());

			ps.execute();
			ps.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}// fim do metodo deletar
 /*
	public List<EHotel> listarTodos() {
		String sql = "SELECT * FROM hotel";
		List<EHotel> list = new ArrayList<>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EHotel h = new EHotel();

				h.setCodhotel(rs.getLong("codhotel"));
				h.setNome(rs.getString("nome"));
				h.setRua(rs.getString("rua"));
				h.setQuadra(rs.getString("quadra"));
				h.setLote(rs.getString("lote"));
				h.setBairro(rs.getString("bairro"));
				h.setDescricao(rs.getString("descricao"));
				h.setClassificacao(rs.getInt("classificacao"));
				h.setNumero(rs.getString("numero"));
				h.setFoto(rs.getString("foto"));
				h.setQtdquarto(rs.getInt("qtdquarto"));
				list.add(h);
			} 
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}// fim do metodo listarTodos
	*/
	
	public Iterator<EHotel> listarTodos() {
		String sql = "SELECT * FROM hotel";
		List<EHotel> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EHotel h = new EHotel();

				h.setCodhotel(rs.getLong("codhotel"));
				h.setNome(rs.getString("nome"));
				h.setRua(rs.getString("rua"));
				h.setQuadra(rs.getString("quadra"));
				h.setLote(rs.getString("lote"));
				h.setBairro(rs.getString("bairro"));
				h.setDescricao(rs.getString("descricao"));
				h.setClassificacao(rs.getInt("classificacao"));
				h.setNumero(rs.getString("numero"));
				h.setFoto(rs.getString("foto"));
				h.setQtdquarto(rs.getInt("qtdquarto"));
				list.add(h);
			} 
			
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Iterator<EHotel> it = list.iterator();
		return it;
	}// fim do metodo listarTodos
	
	public EHotel pesquisarHotelCod(long codhotel) {
		String sql = "SELECT * FROM hotel WHERE codhotel=?";
		EHotel h = null;

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, codhotel);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				h = new EHotel();

				h.setCodhotel(rs.getLong("codhotel"));
				h.setNome(rs.getString("nome"));
				h.setRua(rs.getString("rua"));
				h.setQuadra(rs.getString("quadra"));
				h.setLote(rs.getString("lote"));
				h.setBairro(rs.getString("bairro"));
				h.setDescricao(rs.getString("descricao"));
				h.setClassificacao(rs.getInt("classificacao"));
				h.setNumero(rs.getString("numero"));
				h.setFoto(rs.getString("foto"));
				h.setQtdquarto(rs.getInt("qtdquarto"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;

	}// fim do metodo pesquisarClienteCod

	public EHotel pesquisarHotelNome(String nome) {
		String sql = "SELECT * FROM hotel WHERE UPPER(nome) LIKE ?";
		EHotel h = null;

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, '%'+nome+'%');

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				h = new EHotel();
				h.setCodhotel(rs.getLong("codhotel"));
				h.setNome(rs.getString("nome"));
				h.setRua(rs.getString("rua"));
				h.setQuadra(rs.getString("quadra"));
				h.setLote(rs.getString("lote"));
				h.setBairro(rs.getString("bairro"));
				h.setDescricao(rs.getString("descricao"));
				h.setClassificacao(rs.getInt("classificacao"));
				h.setNumero(rs.getString("numero"));
				h.setFoto(rs.getString("foto"));
				h.setQtdquarto(rs.getInt("qtdquarto"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h;

	}// fim do metodo pesquisarClienteCod

}
