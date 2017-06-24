package br.com.hotel.si.console;

import org.easyrules.api.RulesEngine;
import static org.easyrules.core.RulesEngineBuilder.aNewRulesEngine;

import br.com.hotel.si.entidade.Cliente;
import br.com.hotel.si.entidade.TipoQuarto;
import br.com.hotel.si.regra.DefineQuartoBasico;
import br.com.hotel.si.regra.DefineQuartoFamilia;
import br.com.hotel.si.regra.DefineQuartoLuxo;

public class IndicaQuarto {

	public static void main(String[] args){
	
		Cliente cliente = new Cliente(Cliente.QuantidadeFamilia.FAMILIA_GRANDE);
		
		TipoQuarto tipoQuarto = new TipoQuarto();
		
		DefineQuartoBasico defineQuartoBasico = new DefineQuartoBasico(cliente, tipoQuarto);
		DefineQuartoFamilia defineQuartoFamilia= new DefineQuartoFamilia(cliente, tipoQuarto);
		DefineQuartoLuxo defineQuartoLuxo = new DefineQuartoLuxo(cliente, tipoQuarto);
		
		RulesEngine rulesEngine = aNewRulesEngine().withSilentMode(true).build();
		
		rulesEngine.registerRule(defineQuartoBasico);
		rulesEngine.registerRule(defineQuartoFamilia);
		rulesEngine.registerRule(defineQuartoLuxo);
		rulesEngine.fireRules();
	}
}
