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
		String sql = "INSERT INTO hotel (nome,cep,endereco,estado,cidade, bairro, descricao, classificacao, foto, qtdquarto,tipohotel,telefone,codmatriz) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, h.getNome());
			ps.setString(2, h.getCep());
			ps.setString(3, h.getEndereco());
			ps.setString(4, h.getEstado());
			ps.setString(5, h.getCidade());
			ps.setString(6, h.getBairro());
			ps.setString (7, h.getDescricao());
			ps.setInt(8, h.getClassificacao());
			ps.setString(9, h.getFoto());
			ps.setInt   (10,h.getQtdquarto());
			ps.setString(11, h.getTipohotel());
			ps.setString(12, h.getTelefone());
			ps.setLong(13, h.getCodmatriz());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// fim do metodo cadastrar

	public void alterar(EHotel h) {
		String sql = "UPDATE hotel SET nome=?,cep=?,endereco=?,estado=?,cidade=?,bairro=?,"
				+ " descricao=?,classificacao=?,foto=?,qtdquarto=?,tipohotel=?,telefone=? WHERE codhotel=?";

		try {
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, h.getNome());
			ps.setString(2, h.getCep());
			ps.setString(3, h.getEndereco());
			ps.setString(4, h.getEstado());
			ps.setString(5, h.getCidade());
			ps.setString(6, h.getBairro());
			ps.setString (7, h.getDescricao());
			ps.setInt(8, h.getClassificacao());
			ps.setString(9, h.getFoto());
			ps.setInt   (10,h.getQtdquarto());
			ps.setString(11, h.getTipohotel());
			ps.setString(12, h.getTelefone());
			ps.setLong(13, h.getCodhotel());
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
				EHotel hotel = new EHotel();
				hotel.setCodhotel(rs.getLong("codhotel"));
				hotel.setNome(rs.getString("nome"));
				hotel.setCep(rs.getString("cep"));
				hotel.setEndereco(rs.getString("endereco"));
				hotel.setEstado(rs.getString("estado"));
				hotel.setCidade(rs.getString("cidade"));
				hotel.setBairro(rs.getString("bairro"));
				hotel.setDescricao(rs.getString("descricao"));
				hotel.setClassificacao(rs.getInt("classificacao"));
				hotel.setFoto(rs.getString("foto"));
				hotel.setQtdquarto(rs.getInt("qtdquarto"));
				hotel.setTipohotel(rs.getString("tipohotel"));
				hotel.setTelefone(rs.getString("telefone"));
				list.add(hotel);
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
		EHotel hotel = new EHotel();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, codhotel);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				hotel.setCodhotel(rs.getLong("codhotel"));
				hotel.setNome(rs.getString("nome"));
				hotel.setCep(rs.getString("cep"));
				hotel.setEndereco(rs.getString("endereco"));
				hotel.setEstado(rs.getString("estado"));
				hotel.setCidade(rs.getString("cidade"));
				hotel.setBairro(rs.getString("bairro"));
				hotel.setDescricao(rs.getString("descricao"));
				hotel.setClassificacao(rs.getInt("classificacao"));
				hotel.setFoto(rs.getString("foto"));
				hotel.setQtdquarto(rs.getInt("qtdquarto"));
				hotel.setTipohotel(rs.getString("tipohotel"));
				hotel.setTelefone(rs.getString("telefone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotel;
	}// fim do metodo pesquisarClienteCod

	public EHotel pesquisarHotelNome(String nome) {
		String sql = "SELECT * FROM hotel WHERE UPPER(nome) LIKE ?";
		EHotel hotel = new EHotel();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, '%'+nome+'%');
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				hotel.setCodhotel(rs.getLong("codhotel"));
				hotel.setNome(rs.getString("nome"));
				hotel.setCep(rs.getString("cep"));
				hotel.setEndereco(rs.getString("endereco"));
				hotel.setEstado(rs.getString("estado"));
				hotel.setCidade(rs.getString("cidade"));
				hotel.setBairro(rs.getString("bairro"));
				hotel.setDescricao(rs.getString("descricao"));
				hotel.setClassificacao(rs.getInt("classificacao"));
				hotel.setFoto(rs.getString("foto"));
				hotel.setQtdquarto(rs.getInt("qtdquarto"));
				hotel.setTipohotel(rs.getString("tipohotel"));
				hotel.setTelefone(rs.getString("telefone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotel;
	}
	
		public List<EHotel> pesquisarHotelCidade(String destino) {
			String sql = "SELECT DISTINCT h.codhotel as CODIGO, "
					+ "h.nome as NOME_HOTEL, "
					+ "h.endereco as ENDERECO,"
					+ "h.bairro as BAIRRO,"
					+ "h.cidade as CIDADE,"
					+ "h.cep as CEP,"
					+ "h.estado as ESTADO,"
					+ "h.descricao as DESCRICAO,"
					+ "h.classificacao as CLASSIFICACAO,"
					+ "h.precoDiaria as PRECO_DIARIA,"
					+ "h.foto as FOTO "
					+ "FROM hotel h "
					+ "INNER JOIN tipoquarto t "
					+ "ON h.codhotel = t.codhotel "
					+ "WHERE cidade ~* ? "
					+ "AND t.quantidadequarto > 0"
					+ "ORDER BY h.nome ASC";
			List<EHotel> lista = new ArrayList<>();
			try {
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setString(1, destino);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					EHotel h = new EHotel();
					h.setCodhotel(rs.getLong("CODIGO"));
					h.setNome(rs.getString("NOME_HOTEL"));
					h.setEndereco(rs.getString("ENDERECO"));
					h.setBairro(rs.getString("BAIRRO"));
					h.setCidade(rs.getString("CIDADE"));
					h.setCep(rs.getString("CEP"));
					h.setEstado(rs.getString("ESTADO"));
					h.setDescricao(rs.getString("DESCRICAO"));
					h.setClassificacao(rs.getInt("CLASSIFICACAO"));
					h.setPrecoDiaria(rs.getDouble("PRECO_DIARIA"));
					h.setFoto(rs.getString("FOTO"));
					lista.add(h);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lista;
		}
<<<<<<< HEAD
		
		
=======
		return lista;
	}
	
	public Iterator<EHotel> listarHotelFilial() {
		String sql = "SELECT * FROM hotel WHERE tipohotel = 'filial'";
		List<EHotel> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EHotel hotel = new EHotel();
				hotel.setCodhotel(rs.getLong("codhotel"));
				hotel.setNome(rs.getString("nome"));
				hotel.setCep(rs.getString("cep"));
				hotel.setEndereco(rs.getString("endereco"));
				hotel.setEstado(rs.getString("estado"));
				hotel.setCidade(rs.getString("cidade"));
				hotel.setBairro(rs.getString("bairro"));
				hotel.setDescricao(rs.getString("descricao"));
				hotel.setClassificacao(rs.getInt("classificacao"));
				hotel.setFoto(rs.getString("foto"));
				hotel.setQtdquarto(rs.getInt("qtdquarto"));
				hotel.setTipohotel(rs.getString("tipohotel"));
				hotel.setTelefone(rs.getString("telefone"));
				hotel.setCodmatriz(rs.getLong("codmatriz"));
				list.add(hotel);
			} 
			
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Iterator<EHotel> it = list.iterator();
		return it;
	}// fim do metodo listarTodos
	
>>>>>>> master
}
