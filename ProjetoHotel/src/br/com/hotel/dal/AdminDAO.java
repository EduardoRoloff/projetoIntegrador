package br.com.hotel.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hotel.model.EAdmistrador;
import br.com.hotel.util.Conexao;

public class AdminDAO {
	
	private Connection connection = Conexao.getConnection();
	
	public AdminDAO(){
		
	}
	
	public EAdmistrador autenticar(EAdmistrador a){
		String sql = "SELECT * FROM admin WHERE login=? and senha=?";
		EAdmistrador adm = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, a.getLogin());
			ps.setString(2, a.getSenha());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				adm = new EAdmistrador();
				
				adm.setCodadmin(rs.getLong("codadmin"));
				adm.setLogin(rs.getString("login"));
				adm.setSenha(rs.getString("senha"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//fim do try/catch
		return adm;
	}//fim do metodo autenticar


}
