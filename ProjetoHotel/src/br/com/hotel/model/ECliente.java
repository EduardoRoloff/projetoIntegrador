package br.com.hotel.model;

public class ECliente {
	
	private long codcliente;
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String telefoneresid;
	private String telefonecelular;
	private String cep;
	private String endereco;
	private String estado;
	private String cidade;
	private String bairro;
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public ECliente(){
		
	}

	public long getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(long codcliente) {
		this.codcliente = codcliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefoneresid() {
		return telefoneresid;
	}

	public void setTelefoneresid(String telefoneresid) {
		this.telefoneresid = telefoneresid;
	}

	public String getTelefonecelular() {
		return telefonecelular;
	}

	public void setTelefonecelular(String telefonecelular) {
		this.telefonecelular = telefonecelular;
	}

}
