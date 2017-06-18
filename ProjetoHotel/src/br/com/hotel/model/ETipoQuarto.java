package br.com.hotel.model;

public class ETipoQuarto {

	private long codtipo;
	private String nome;
	private int quantidadecama;
	private int quantidadepessoa;
	private double valordiaria;
	private String descricao;
	private EHotel hotel;
	
	public ETipoQuarto(){
		hotel = new EHotel();
	}

	public long getCodtipo() {
		return codtipo;
	}

	public void setCodtipo(long codtipo) {
		this.codtipo = codtipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadecama() {
		return quantidadecama;
	}

	public void setQuantidadecama(int quantidadecama) {
		this.quantidadecama = quantidadecama;
	}

	public int getQuantidadepessoa() {
		return quantidadepessoa;
	}

	public void setQuantidadepessoa(int quantidadepessoa) {
		this.quantidadepessoa = quantidadepessoa;
	}

	public double getValordiaria() {
		return valordiaria;
	}

	public void setValordiaria(double valordiaria) {
		this.valordiaria = valordiaria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EHotel getHotel() {
		return hotel;
	}

	public void setHotel(EHotel hotel) {
		this.hotel = hotel;
	}
}
