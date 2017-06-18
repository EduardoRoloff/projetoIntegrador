package br.com.hotel.model;

public class EGrupoAtributoQuarto {
	private long codgrupo;
	private String nome;
	private EQuarto quarto;
	
	public EGrupoAtributoQuarto() {
		quarto = new EQuarto();
	}

	public long getCodgrupo() {
		return codgrupo;
	}

	public void setCodgrupo(long codgrupo) {
		this.codgrupo = codgrupo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EQuarto getQuarto() {
		return quarto;
	}

	public void setQuarto(EQuarto quarto) {
		this.quarto = quarto;
	}
}
