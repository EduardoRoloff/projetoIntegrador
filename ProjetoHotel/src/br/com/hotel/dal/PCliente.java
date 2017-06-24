package br.com.hotel.dal;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hotel.model.ECliente;
import br.com.hotel.util.Conexao;

public class PCliente {
	
	private Connection connection;
	
	public PCliente(){
		connection = Conexao.getConnection();
	}
	
	public void inserir(ECliente objeto) throws SQLException{
			String sql = "INSERT INTO cliente(email,senha,nome,sobrenome) VALUES (?, ?, ?, ? )";
			PreparedStatement prd = connection.prepareStatement(sql);
			prd.setString(1,  objeto.getEmail());
			prd.setString(2,  objeto.getSenha());
			prd.setString(3,  objeto.getNome());
			prd.setString(4,  objeto.getSobrenome());
		    prd.executeUpdate();
	}
	
	public boolean verificarUsuario(ECliente objeto) throws SQLException{
		
		boolean resultado = false;
		String sql = "SELECT * FROM cliente WHERE email=? AND senha=?";
		PreparedStatement prd = connection.prepareStatement(sql);
		prd.setString(1, objeto.getEmail());
		prd.setString(2, objeto.getSenha());
		ResultSet rs = prd.executeQuery();
		
		if(rs.next()){
			resultado = true;
		}
		return resultado;
	}
	
	public boolean verificarEmail(String email){
		boolean resultado = false;
		String sql = "SELECT * FROM cliente WHERE email=?";
		try {
			PreparedStatement prd = connection.prepareStatement(sql);
			prd.setString(1, email);
			ResultSet rs = prd.executeQuery();
			if(rs.next()){
				resultado = true;
			}
		} catch (Exception e) {
			System.out.println("ERRO: Classe 'ClienteDAO', metodo 'verificarEmail'.");
			e.printStackTrace();
		}
		return resultado;
	}
	
	public ECliente consultar(ECliente objeto) throws SQLException{
		String sql = "SELECT * FROM cliente WHERE email=? AND senha=?";
		PreparedStatement prd = connection.prepareStatement(sql);
		prd.setString(1, objeto.getEmail());
		prd.setString(2, objeto.getSenha());
		ResultSet rs = prd.executeQuery();	
		ECliente cliente = new ECliente();
		if(rs.next()){
				cliente.setCodcliente(rs.getLong("codcliente"));
				cliente.setEmail(rs.getString("email"));
				cliente.setNome(rs.getString("nome"));
				cliente.setSenha(rs.getString("senha"));
				cliente.setSobrenome(rs.getString("sobrenome"));
				cliente.setTelefonecelular(rs.getString("telefonecelular"));
				cliente.setTelefoneresid(rs.getString("telefoneresid"));
				cliente.setCidade(rs.getString("cidade"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setEstado(rs.getString("estado"));
				cliente.setBairro(rs.getString("bairro"));
				cliente.setCep(rs.getString("cep"));
		}
		return cliente;
	}
	
	public void alterarDadosPessoais(ECliente objeto){
		
		String sql = "UPDATE cliente SET nome=?, sobrenome=?, telefoneresid=?, telefonecelular=?, cidade=?, endereco=?, estado=?, bairro=?, cep=? WHERE codcliente=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, objeto.getNome());
			ps.setString(2, objeto.getSobrenome());
			ps.setString(3, objeto.getTelefoneresid());
			ps.setString(4, objeto.getTelefonecelular());
			ps.setString(5, objeto.getCidade());
			ps.setString(6, objeto.getEndereco());
			ps.setString(7, objeto.getEstado());
			ps.setString(8, objeto.getBairro());
			ps.setString(9, objeto.getCep());
			ps.setLong  (10, objeto.getCodcliente());
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO: Classe 'ClienteDAO', metodo 'alterar'.");
			e.printStackTrace();
		}
	}//fim do metodo alterar
	
	public void alterarEmail(ECliente objeto){
		String sql = "UPDATE cliente SET email=? WHERE codcliente=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, objeto.getEmail());
			ps.setLong  (2, objeto.getCodcliente());
			ps.execute();
			ps.close();
			System.out.println("Alterado com sucesso.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO: Classe 'ClienteDAO', metodo 'alterarEmail'.");
			e.printStackTrace();
		}
	}//fim do metodo alterar
	
	public void alterarSenha(ECliente objeto){
		String sql = "UPDATE cliente SET senha=? WHERE codcliente=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, objeto.getSenha());
			ps.setLong  (2, objeto.getCodcliente());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO: Classe 'ClienteDAO', metodo 'alterarSenha'.");
			e.printStackTrace();
		}
	}//fim do metodo alterar

	public boolean verificarSenha(ECliente objeto){
		boolean resultado = false;
		String sql = "SELECT * FROM cliente WHERE senha=? AND codcliente=?";
		try {
			PreparedStatement prd = connection.prepareStatement(sql);
			prd.setString(1, objeto.getSenha());
			prd.setLong(2, objeto.getCodcliente());
			ResultSet rs = prd.executeQuery();
			if(rs.next()){
				resultado = true;
			}
		} catch (Exception e) {
			System.out.println("ERRO: Classe 'ClienteDAO', metodo 'verificarSenha'.");
			e.printStackTrace();
		}
		return resultado;
	}
	
	public void deletar(long codcliente){
		String sql = "DELETE FROM cliente WHERE codcliente=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setLong  (1, codcliente);
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO: Classe 'ClienteDAO', metodo 'deletar'.");
			e.printStackTrace();
		}
	}
	
	public List<ECliente> listarTodos(){
		String sql = "SELECT * FROM cliente";
		List<ECliente> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				ECliente c = new ECliente();
				
				c.setCodcliente(rs.getLong("codcliente"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setSenha(rs.getString("senha"));
				c.setTelefoneresid(rs.getString("telefoneresid"));
				c.setTelefonecelular(rs.getString("telefonecelular"));
				c.setSobrenome(rs.getString("sobrenome"));
				c.setCidade(rs.getString("cidade"));
				c.setEndereco(rs.getString("endereco"));
				c.setEstado(rs.getString("estado"));
				c.setBairro(rs.getString("bairro"));
				c.setCep(rs.getString("cep"));
				list.add(c);
			}//fim do while
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO: Classe 'ClienteDAO', metodo 'listar'.");
			e.printStackTrace();
		}//fim do try/catch
		return list;
	}//fim do metodo listarTodos
	
}
