<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Página - Minha Conta</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Creative One Page Parallax Template">
	<meta name="keywords" content="Creative, Onepage, Parallax, HTML5, Bootstrap, Popular, custom, personal, portfolio" />
	<meta name="author" content="">	
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/prettyPhoto.css" rel="stylesheet">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
	<script type="text/javascript" src="js/form.js"></script>
</head>
<body>
	<jsp:include page="menuPagina.jsp"></jsp:include>

	<!-- Dados Pessoais  -->
	<section>
		<form name="form1" id="main" method="post">
			<div class="jumbotron containerr">
				<table>
					<tr>
						<td>
							<h2>Minhas Informações</h2>
							<h3>Atualize seus dados pessoais</h3>
						</td>
					</tr>
					<tr>
						<td>
							<label for="nome">Nome *</label>
							<input class="campoNome" type="text" name="nome" id="nome" required placeholder="Seu nome" value='<c:out value="${usuario.nome}"></c:out>'/>
						</td>
					</tr>
					<tr>
						<td>
							<label for="nome">Sobrenome *</label>
							<input class="campoNome" type="text" name="sobrenome" id="sobrenome" required placeholder="Seu sobrenome" value='<c:out value="${usuario.sobrenome}"></c:out>'/>
						</td>
					</tr>
					<tr>
						<td>
							<label for="telefoneresid">Telefone Residencial *</label>
							<input class="campo" type="text" name="telefoneresid" id="campoTelefone" placeholder="Telefone Residencial" onkeypress="MascaraTelefone(this)" maxlength="14" value='<c:out value="${usuario.telefoneresid}"></c:out>'/>
						</td>
					</tr>
					<tr>
						<td>
							<label for="telefonecelular">Telefone Celular *</label>
							<input type="text" name="telefonecelular" id="campoTelefone" placeholder="Telefone Celular" onkeypress="MascaraCelular(this);" maxlength="15" value='<c:out value="${usuario.telefonecelular}"></c:out>'/>
						</td>
					</tr>
					<tr>
						<td>
							<label for="cep">CEP</label>
							<input type="text" name="cep" placeholder="Digite seu CEP" id="cep" onkeypress="MascaraCep(this);" onblur="ValidaCep(this)" maxlength="10" value='<c:out value="${usuario.cep}"></c:out>'/>
						</td>
						<td>
							<label id="lugarEndereco" for="endereco">Endereço</label>
							<input type="text" name="endereco" id="endereco" placeholder="Digite sua rua" value='<c:out value="${usuario.endereco}"></c:out>'/>
						</td>
					</tr>
					<tr>
						<td>
							<label for="estado">Estado</label>
							<input type="text" name="estado" id="estado" placeholder="Estado" value='<c:out value="${usuario.estado}"></c:out>'/>
						</td>
						<td>
							<td>
								<label id="lugarCidade" for="cidade">Cidade</label>
								<input type="text" name="cidade" id="cidade" placeholder="Cidade" value='<c:out value="${usuario.cidade}"></c:out>'/>
							</td>
							<td>	
								<label id="lugarBairro" for="bairro">Bairro</label>
								<input type="text" name="bairro" id="bairro" placeholder="Bairro" value='<c:out value="${usuario.bairro}"></c:out>'/>
							</td>
						</td>
					</tr>	
					<tr>
						<td>
							<button type="submit" name="botao" value="alterarDadosPessoais">Salvar seus Dados</button>
							<label id="dadosalterados" name="dadosalterados"><c:out value="${dadosalterados}"/></label>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</section>
	<!-- Alteração de E-mail -->
	<section>
		<form method="post" action="ClienteController">
			<div class="jumbotron containerr">
				<table>
					<tr>
						<td>
							<h2>Atualizar endereço de e-mail</h2>
						</td>
					</tr>
					<tr>
						<td>
							<label id="emailalterado" name="emailalterado"><c:out value="${emailalterado}"/></label>
						</td>
					</tr>
					<tr>
						<td>
							<label for="email">E-mail</label>
							<input type="text" name="email" id="campoEmail" placeholder="Digite seu E-mail" value='<c:out value="${usuario.email}"></c:out>'/>
						</td>
					</tr>
					<tr>
						<td>
							<label for="senha">Senha</label>
							<input type="password" placeholder="Digite sua senha" name="senha" id="campoSenha" required>
						</td>
					</tr>
					<tr>
						<td>
							<label for="mensagem1">Para manter sua conta em segurança,
								solicitamos a inserção da senha antes da alteração do endereço de e-mail
							</label>
						</td>
					</tr>
					<tr>
						<td>
							<button type="submit" name="botao" value="alterarEmail">Salvar endereço de e-mail</button>
							<label id="erro" name="erro"><c:out value="${error}"/></label>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</section>
	<!-- Alteração de Senha -->
	<section>
		<form method="post" action="ClienteController">
			<div class="jumbotron containerr">
				<table>
					<tr>
						<td>
							<h3>Atualizar Senha</h3>
						</td>
					</tr>
					<tr>
						<td>
							<label id="erro" name="erro"><c:out value="${error}"/></label>
						</td>
					</tr>
					<tr>
						<td>
							<label for="senhaAtual">Senha Atual</label>
							<input id="campoSenhaA" type="password" placeholder="Digite a senha atual" name="oldsenha" id="oldsenha"/>
						</td>
					</tr>
					<tr>
						<td>
							<label for="novaSenha">Nova Senha</label>
							<input id="campoSenhaN" type="password" placeholder="Digite a nova senha" name="newsenha" id="newsenha" required>
						</td>
					</tr>
					<tr>
						<td>
							<label for="novaSenha">Nova Senha</label>
							<input id="campoSenhaNN" type="password" placeholder="Digite a senha novamente" name="repeatnewsenha" id="repeatnewsenha" required>
						</td>
					</tr>
					<tr>
						<td>
							<label id="senhaalterada" name="senhaalterada"><c:out value="${senhaalterada}"/></label>
						</td>
					</tr>
					<tr>
						<td>
							<button type="submit" name="botao" value="alterarSenha">Salvar senha</button>
						</td>
					</tr>
				</table>
			</div>
		</form>
	</section>
	<!-- Exclusao de Conta -->
	<section>
		<div>
			<table>
				<tr>
					<td>
						<h2 id="localMensagemD">Deseja excluir a conta?</h2>
					</td>
				</tr>
				<tr>
					<td>
						<label id="localMensagem" for="">
							<h4>Lamentamos sua decisão<br>
							Se você excluir esta conta, nós não poderemos reativá-la<br>
							Se você tiver problemas com sua conta, entre em contato<br>
							conosco e teremos o prazer de ajudá-lo.</h4>
						</label>
					</td>
				</tr>
				<tr>
					<td align="center">
						<a href="javascript:confirmarExclusao(${usuario.codcliente})"><h3 id="localMensagemE">Excluir Conta</h3></a>
					</td>
				</tr>
			</table>
		</div>
	</section>
	
	<!-- Footer -->
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/smoothscroll.js"></script>
	<script type="text/javascript" src="js/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
	<script type="text/javascript" src="js/jquery.parallax.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
	<script type="text/javascript" src="js/mascaraValidacao.js"></script>
	<script type="text/javascript" src="js/endereco.js"></script>
</body>
</html>