package br.com.hotel.testes;

import static org.junit.Assert.*;
import java.sql.SQLException;
import static junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;
import br.com.hotel.dal.PCliente;
import br.com.hotel.model.ECliente;

public class PClienteTest {

	PCliente persistencia;
	ECliente cliente;
	
	@Before
	public void setUp() throws Exception {
		persistencia = new PCliente();
		cliente = new ECliente();
	}
	@Test
	public void testVerificarUsuario() throws SQLException{
		cliente.setEmail("celsogomes22@gmail.com");
		cliente.setSenha("123");
		assertEquals(true, persistencia.verificarUsuario(cliente));
	}
	@Test
	public void testVerificarEmail() throws SQLException{
		String email = "celsogomes22222@gmail.com";
		cliente.setEmail(email);
		assertEquals(false, persistencia.verificarEmail(email));
	}
	@Test
	public void testVerificarSenha() throws SQLException{
		cliente.setCodcliente(5);
		cliente.setSenha("123");
		assertEquals(true, persistencia.verificarSenha(cliente));
	}
}
