package br.com.hotel.model;

public class ECidades {
	
	private long id;
	private String nome;
	private EEstados estado;
	
	public ECidades() {
		estado = new EEstados();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EEstados getEstado() {
		return estado;
	}

	public void setEstado(EEstados nomeEstado) {
		this.estado = nomeEstado;
	}

	
}
