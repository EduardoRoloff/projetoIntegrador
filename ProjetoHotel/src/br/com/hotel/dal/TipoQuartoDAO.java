package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.hotel.model.EHotel;
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
	
	public List<ETipoQuarto> listarQuartos(int codigo){
		String sql = "SELECT t.codtipo as CODIGO, "
				+ "t.nome as NOME, "
				+ "t.quantidadecama as QTDCAMA, "
				+ "t.descricao as DESCRICAO, "
				+ "t.quantidadepessoa as PESSOAS, "
				+ "t.valordiaria as DIARIA, "
				+ "t.foto as FOTO, "
				+ "t.codhotel as CODIGO_HOTEL "
				+ "FROM hotel h "
				+ "INNER JOIN tipoquarto t "
				+ "ON h.codhotel = t.codhotel "
				+ "WHERE t.codhotel = ? "
				+ "AND t.quantidadequarto > 0 ";
		List<ETipoQuarto> lista = new ArrayList<>();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, codigo);
			System.out.println("Teste: " + ps.toString());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ETipoQuarto objeto = new ETipoQuarto();
				objeto.setCodtipo(rs.getLong("CODIGO"));
				objeto.setNome(rs.getString("NOME"));
				objeto.setQuantidadecama(rs.getInt("QTDCAMA"));
				objeto.setDescricao(rs.getString("DESCRICAO"));
				objeto.setQuantidadepessoa(rs.getInt("PESSOAS"));
				objeto.setValordiaria(rs.getDouble("DIARIA"));
				objeto.setFoto(rs.getString("FOTO"));
				objeto.getHotel().setCodhotel(rs.getLong("CODIGO_HOTEL"));
				lista.add(objeto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public ETipoQuarto mostrarDetalhesQuarto(long codigoHotel, long codigotipo){
		String sql = "SELECT h.codhotel as CODIGO_HOTEL, "
				+ "h.nome as NOME_HOTEL, "
				+ "h.endereco as ENDERECO, "
				+ "h.telefone as TELEFONE, "
				+ "t.codtipo as CODIGO_TIPO, "
				+ "t.nome as TIPO, "
				+ "t.descricao as DESCRICAO,"
				+ "t.quantidadecama as QTDCAMA, "
				+ "t.quantidadepessoa as QTDPESSOA "
				+ "FROM hotel h "
				+ "INNER JOIN tipoquarto t "
				+ "ON h.codhotel = t.codhotel "
				+ "WHERE h.codhotel = ? "
				+ "AND t.codtipo = ? ";
		ETipoQuarto objeto = new ETipoQuarto();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, codigoHotel);
			ps.setLong(2, codigotipo);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				objeto.setCodtipo(rs.getLong("CODIGO_TIPO"));
				objeto.setNome(rs.getString("TIPO"));
				objeto.setQuantidadecama(rs.getInt("QTDCAMA"));
				objeto.setDescricao(rs.getString("DESCRICAO"));
				objeto.setQuantidadepessoa(rs.getInt("QTDPESSOA"));
				objeto.getHotel().setCodhotel(rs.getLong("CODIGO_HOTEL"));
				objeto.getHotel().setNome(rs.getString("NOME_HOTEL"));
				objeto.getHotel().setEndereco(rs.getString("ENDERECO"));
				objeto.getHotel().setTelefone(rs.getString("TELEFONE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objeto;
	}
	
	public Iterator<ETipoQuarto> listarTipoQuartoAdm(long codhotel) {
		String sql = "SELECT tipoquarto.codtipo AS codquarto,tipoquarto.nome AS nometipoquarto, "
					+ "tipoquarto.quantidadequarto AS qtdquarto,hotel.nome AS nomehotel "
					+ " FROM tipoquarto INNER JOIN hotel "
					+ "ON tipoquarto.codhotel = hotel.codhotel "
					+ "WHERE hotel.codhotel = ?";
		List<ETipoQuarto> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, codhotel);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ETipoQuarto tipoQuarto = new ETipoQuarto();
				tipoQuarto.setCodtipo(rs.getLong("codquarto"));
				tipoQuarto.setNome(rs.getString("nometipoquarto"));
				tipoQuarto.setQuantidadequarto(Integer.parseInt(rs.getString("qtdquarto")));
				tipoQuarto.getHotel().setNome(rs.getString("nomehotel"));
				list.add(tipoQuarto);
			} 
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Iterator<ETipoQuarto> it = list.iterator();
		return it;
	}// fim do metodo listarTodos
}
