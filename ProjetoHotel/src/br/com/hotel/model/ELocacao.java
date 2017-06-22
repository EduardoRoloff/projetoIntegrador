package br.com.hotel.model;

public class ELocacao {
	private long codreserva;
	private String status;
	private ECliente cliente;
	private EHotel hotel;
	private String datasaida;
	private String dataentrada;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ECliente getCliente() {
		return cliente;
	}

	public void setCliente(ECliente cliente) {
		this.cliente = cliente;
	}

	public EHotel getHotel() {
		return hotel;
	}

	public void setHotel(EHotel hotel) {
		this.hotel = hotel;
	}

	public String getDatasaida() {
		return datasaida;
	}

	public void setDatasaida(String datasaida) {
		this.datasaida = datasaida;
	}

	public String getDataentrada() {
		return dataentrada;
	}

	public void setDataentrada(String dataentrada) {
		this.dataentrada = dataentrada;
	}

	public long getCodreserva() {
		return codreserva;
	}

	public void setCodreserva(long codreserva) {
		this.codreserva = codreserva;
	}
	
	
}
