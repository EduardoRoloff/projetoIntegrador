package br.com.hotel.si.entidade;

public class TipoQuarto {

	private QuantidadeDePessoas quantidadeDePessoas;
	private Tamanho tamanho;

	public enum QuantidadeDePessoas{
		UMA_PESSOA(1), DUAS_OU_TRES_PESSOAS(2), ACIMA_DE_TRES_PESSOAS(3);
		
		private final int valor;
		
		QuantidadeDePessoas(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}
	
	public enum Tamanho{
		PEQUENO(1), MEDIO(2), GRANDE(3);
		
		private final int valor;
		
		Tamanho(int valorOpcao){
			valor = valorOpcao;
		}
		
		public int getValor(){
			return valor;
		}
	}

	public QuantidadeDePessoas getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}

	public void setQuantidadeDePessoas(QuantidadeDePessoas quantidadeDePessoas) {
		this.quantidadeDePessoas = quantidadeDePessoas;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

//	public TipoQuarto(QuantidadeDePessoas quantidadeDePessoas, Tamanho tamanho) {
//		this.quantidadeDePessoas = quantidadeDePessoas;
//		this.tamanho = tamanho;
//	}
//	
	
}
