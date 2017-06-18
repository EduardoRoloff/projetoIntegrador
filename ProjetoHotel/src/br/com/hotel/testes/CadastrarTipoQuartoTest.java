package br.com.hotel.testes;

import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.hotel.bll.strategy.CadastrarQuarto;

public class CadastrarTipoQuartoTest {

	CadastrarQuarto cadQuarto;
	@Before
	public void setUp() throws Exception {
		cadQuarto = new CadastrarQuarto();
	}

	@Test
	public void testAcaoQuarto() {
		String caminho = "/newcadastroQuarto.jsp";
		//assertEquals(caminho, cadQuarto.acaoQuarto());
	}

}
