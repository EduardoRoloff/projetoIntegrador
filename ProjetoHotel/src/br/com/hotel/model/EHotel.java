package br.com.hotel.model;

public class EHotel {
	
	private long   codhotel;
	private String nome;
	private String rua;
	private String quadra;
	private String lote;
	private String bairro;
	private String descricao;
	private int    classificacao;
	private String numero;
	private String foto;
	private int	   qtdquarto;
	private String tipohotel;
	private ECidades cidade;
	private String telefone;
	private String cep;
	
	public EHotel(){
		cidade = new ECidades();
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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String qudra) {
		this.quadra = qudra;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public ECidades getCidade() {
		return cidade;
	}

	public void setCidade(ECidades cidade) {
		this.cidade = cidade;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
