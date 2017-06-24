package br.com.hotel.si.entidade;

public class Cliente {

	private QuantidadeFamilia quantidadeFamalia;
//	private Salario salario;
	
	public enum QuantidadeFamilia{
		FAMILIA_PEQUENA(1), FAMILIA_MEDIA(2), FAMILIA_GRANDE(3);
		
		private final int valor;
		
		QuantidadeFamilia(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
//	public enum Salario{
//		SALARIO_MINIMO(1), SALARIO_MEDIO(2), SALARIO_ALTO(3);
//		
//		private final int valor;
//		
//		Salario(int valorOpcao){
//			valor = valorOpcao;
//		}
//		
//		public int getValor(){
//			return valor;
//		}
//	}

	public QuantidadeFamilia getQuantidadeFamalia() {
		return quantidadeFamalia;
	}

	public void setQuantidadeFamalia(QuantidadeFamilia quantidadeFamalia) {
		this.quantidadeFamalia = quantidadeFamalia;
	}

//	public Salario getSalario() {
//		return salario;
//	}
//
//	public void setSalario(Salario salario) {
//		this.salario = salario;
//	}

	public Cliente(QuantidadeFamilia quantidadeFamalia /*, Salario salario*/) {
		this.quantidadeFamalia = quantidadeFamalia;
//		this.salario = salario;
	}
	
	
}
