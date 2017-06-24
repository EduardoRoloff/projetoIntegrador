package br.com.hotel.si.regra;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import br.com.hotel.si.entidade.Cliente;
import br.com.hotel.si.entidade.TipoQuarto;

@Rule(name = "Define o Quarto Basico", description = "regra criada para definir o quarto basico")

public class DefineQuartoBasico {
	
	private Cliente cliente;
	private TipoQuarto tipoQuarto;
	
	@Condition
	public boolean when(){
		if (cliente.getQuantidadeFamalia()  == Cliente.QuantidadeFamilia.FAMILIA_PEQUENA || 
				cliente.getQuantidadeFamalia() == Cliente.QuantidadeFamilia.FAMILIA_MEDIA) {
			return true;
		}
		return false;
	}
	
	@Action(order = 1)
	public void primeiraAcao() throws Exception{
		System.out.println("Quarto escolhido - BÁSICO");
		 tipoQuarto.setTamanho(TipoQuarto.Tamanho.PEQUENO);
	}
	
	@Action(order = 2)
	public void segundaAcao() throws Exception{
		System.out.println("Quarto escolhido - BÁSICO");
		tipoQuarto.setTamanho(TipoQuarto.Tamanho.MEDIO);
	}

	public DefineQuartoBasico(Cliente cliente, TipoQuarto tipoQuarto) {
		this.cliente = cliente;
		this.tipoQuarto = tipoQuarto;
	}
	
	

}
