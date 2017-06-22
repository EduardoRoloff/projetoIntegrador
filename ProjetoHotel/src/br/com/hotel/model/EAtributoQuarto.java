package br.com.hotel.model;

public class EAtributoQuarto {
	private long codatributo;
	private String descricao;
	private EGrupoAtributoQuarto grupo;
	
	public EAtributoQuarto() {
		grupo = new EGrupoAtributoQuarto();
	}

	public long getCodatributo() {
		return codatributo;
	}

	public void setCodatributo(long codatributo) {
		this.codatributo = codatributo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EGrupoAtributoQuarto getGrupo() {
		return grupo;
	}

	public void setGrupo(EGrupoAtributoQuarto grupo) {
		this.grupo = grupo;
	}
}
