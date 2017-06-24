package br.com.hotel.si.regra;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import br.com.hotel.si.entidade.Cliente;
import br.com.hotel.si.entidade.TipoQuarto;

@Rule(name = "Define o Quarto de Luxo", description = "Regra criada para definir o querto de luxo")
public class DefineQuartoLuxo {

	private Cliente cliente;
	private TipoQuarto tipoQuarto;
	
	@Condition
	public boolean when(){
		if (cliente.getQuantidadeFamalia() == Cliente.QuantidadeFamilia.FAMILIA_GRANDE ||
			cliente.getQuantidadeFamalia() == Cliente.QuantidadeFamilia.FAMILIA_MEDIA ||
			cliente.getQuantidadeFamalia() == Cliente.QuantidadeFamilia.FAMILIA_PEQUENA) {
			return true;
		}
		return false;
	}
	
	@Action(order = 1)
	public void primeiraAcao() throws Exception{
		System.out.println("Quarto escolhido - LUXO");
		tipoQuarto.setTamanho(TipoQuarto.Tamanho.GRANDE);
	}
	
	@Action(order = 2)
	public void segundaAcao() throws Exception{
		System.out.println("Quarto escolhido - LUXO");
		tipoQuarto.setTamanho(TipoQuarto.Tamanho.MEDIO);
	}
	
	@Action(order = 3)
	public void terceiraAcao() throws Exception{
		System.out.println("Quarto escolhido - LUXO");
		tipoQuarto.setTamanho(TipoQuarto.Tamanho.PEQUENO);
	}

	public DefineQuartoLuxo(Cliente cliente, TipoQuarto tipoQuarto) {
		this.cliente = cliente;
		this.tipoQuarto = tipoQuarto;
	}
	
	
	
}
