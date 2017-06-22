<%@ page import="br.com.hotel.model.ECliente" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/locacaoCSS.css" rel="stylesheet">
<title>Página - Locação</title>
</head>
<body>
	<div align="center">
				<h3>Efetuar Locacão </h3><br><br>
					<form method="POST" action="locacaocontroller">
							<fieldset>
								<legend>Dados Cliente</legend>
									<%
									ECliente objeto = new ECliente();
									objeto = (ECliente)session.getAttribute("usuario");
									out.println("Cliente: "+ objeto.getNome() + ";" + "<br/>");
									out.println("Telefone Celular: " + objeto.getTelefonecelular() + ";" + "<br/>");
									out.println("Telefone Residencial: " + objeto.getTelefoneresid() + ";" + "<br/>");
									out.println("E-mail: " + objeto.getEmail() + ";" + "<br/>");
									%>
							</fieldset>
							<fieldset>
								<legend>Detalhes Quarto</legend>
										<input type="hidden" id="codigoQuarto" name="codigoQuarto" value="${detalheslocacao.codtipo}"required/><br>
										<span>Tipo do Quarto: <c:out value="${detalheslocacao.nome}"/>;</span><br>
										<span>Descricao: <c:out value="${detalheslocacao.descricao}"/>;</span><br>
										<span>Quantidade cama: <c:out value="${detalheslocacao.quantidadecama}"/>;</span><br>
                						<span>Quantidade pessoas: <c:out value="${detalheslocacao.quantidadepessoa}"/>;</span><br>
                						<span>Valor Diaria: <c:out value="${detalheslocacao.valordiaria}"/></span>
                						<input type="hidden" id="valorDiaria" name="valorDiaria" value="${detalheslocacao.valordiaria}"required/><br>
							</fieldset>
							<fieldset>
								<label>Nome no Cartão:</label>
								<input type="text" name="nomenocartao" id="nomenocartao" placeholder="Digite o nome no cartão.." required/><br>
								<label>Bandeira do cartão: </label>
								<input type="checkbox" id="visa" values="visa" name="cartao"/><label for="visa">Visa</label>
								<input type="checkbox" id="mastercard" values="mastercard" name="cartao"/><label for="mastercard">Mastercard</label><br>
								<label>Numero do Cartão:</label>
								<input type="text" id="numerocartao" name="numerocartao" placeholder="Digite o numero do cartão" required/><br>
								<label>Código de Segurança:</label>
								<input type="text" id="codigoseguranca" name="codigoseguranca" required/><br>
								<label>Data mês Vencimento do Cartão:</label>
								<input type="number" name="quantity" min="1" max="12" required/>
								<label>Data ano Vencimento do Cartão:</label>
								<input type="number" name="quantity" min="2017" max="2037" required/>
							 	<label>CPF:</label>
							 	<input type="text" id="descricao" name="descricao" value="${detalheslocacao.descricao}"required/><br>
                				<button id="input" name="btnacao" type="submit" value="LOCAR" class="btn btn-default">EFETUAR LOCACAO</button>
							</fieldset>
							
							
					</form>
								
	</div>
</body>
</html>