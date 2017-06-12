package br.com.hotel.model;

public class EAdmistrador {
	
	private long codadmin;
	private String login;
	private String senha;
	
	public EAdmistrador(){
		
	}

	public long getCodadmin() {
		return codadmin;
	}

	public void setCodadmin(long codadmin) {
		this.codadmin = codadmin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
