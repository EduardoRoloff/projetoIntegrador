package br.com.hotel.model;

public class EHotel {
	
	private long   codhotel;
	private String nome;
	private String cep;
	private String endereco;
	private String estado;
	private String cidade;
	private String bairro;
	private String descricao;
	private int    classificacao;
	private String foto;
	private int	   qtdquarto;
	private String tipohotel;
	private String telefone;
	private double precoDiaria;
	private long   qtdDias;
	private long   codmatriz;
	
	public long getQtdDias() {
		return qtdDias;
	}
	
	public void setQtdDias(long qtdDias) {
		this.qtdDias = qtdDias;
	}

	public EHotel(){
	}
	
	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public long getCodhotel() {
		return codhotel;
	}

	public void setCodhotel(long codhotel) {
		this.codhotel = codhotel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getQtdquarto() {
		return qtdquarto;
	}

	public void setQtdquarto(int qtdquarto) {
		this.qtdquarto = qtdquarto;
	}

	public String getTipohotel() {
		return tipohotel;
	}

	public void setTipohotel(String tipohotel) {
		this.tipohotel = tipohotel;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public long getCodmatriz() {
		return codmatriz;
	}

	public void setCodmatriz(long codmatriz) {
		this.codmatriz = codmatriz;
	}
	
}
