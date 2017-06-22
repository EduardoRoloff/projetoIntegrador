package br.com.hotel.model;

public class EPagamento {
	private long codpagamento;
	private String nomenocartao;
	private long nrocartao;
	private String bandeira;
	private double valorreserva;
	private long codigoseguranca;
	private String tipopagamento;
	private String mesvencimentocartao;
	private String anovencimento;
	private String cpf;
	private ECliente cliente;
	private ELocacao locacao;
	
	
	public ELocacao getLocacao() {
		return locacao;
	}
	public void setLocacao(ELocacao locacao) {
		this.locacao = locacao;
	}
	public String getNomenocartao() {
		return nomenocartao;
	}
	public void setNomenocartao(String nomenocartao) {
		this.nomenocartao = nomenocartao;
	}
	public long getCodpagamento() {
		return codpagamento;
	}
	public void setCodpagamento(long codpagamento) {
		this.codpagamento = codpagamento;
	}
	public long getNrocartao() {
		return nrocartao;
	}
	public void setNrocartao(long nrocartao) {
		this.nrocartao = nrocartao;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public double getValorreserva() {
		return valorreserva;
	}
	public void setValorreserva(double valorreserva) {
		this.valorreserva = valorreserva;
	}
	public long getCodigoseguranca() {
		return codigoseguranca;
	}
	public void setCodigoseguranca(long codigoseguranca) {
		this.codigoseguranca = codigoseguranca;
	}
	public String getTipopagamento() {
		return tipopagamento;
	}
	public void setTipopagamento(String tipopagamento) {
		this.tipopagamento = tipopagamento;
	}
	public String getMesvencimentocartao() {
		return mesvencimentocartao;
	}
	public void setMesvencimentocartao(String mesvencimentocartao) {
		this.mesvencimentocartao = mesvencimentocartao;
	}
	public String getAnovencimento() {
		return anovencimento;
	}
	public void setAnovencimento(String anovencimento) {
		this.anovencimento = anovencimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ECliente getCliente() {
		return cliente;
	}
	public void setCliente(ECliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
