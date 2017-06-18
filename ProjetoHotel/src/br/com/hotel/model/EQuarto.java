package br.com.hotel.model;

public class EQuarto {
	private long codquarto;
	private int andar;
	private int numero;
	private String descricao;
	private int classificacao;
	private boolean status;
	private ETipoQuarto tipoQuarto;
	private EHotel hotel;

	public EQuarto() {
		tipoQuarto = new ETipoQuarto();
		hotel = new EHotel();
	}
	
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public long getCodquarto() {
		return codquarto;
	}

	public void setCodquarto(long codquarto) {
		this.codquarto = codquarto;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public ETipoQuarto getTipoQuarto() {
		return tipoQuarto;
	}

	
	public void setTipoQuarto(ETipoQuarto tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public EHotel getHotel() {
		return hotel;
	}

	public void setHotel(EHotel hotel) {
		this.hotel = hotel;
	}
}
