<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Adm-Cadastro de Hotel</title>

<!-- CSS do bootstrap -->
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
<!-- CSS personalizado -->
<link rel="stylesheet" href="lib/css-personalizado/newcadastroHotel.css">
<link rel="stylesheet" href="lib/css-personalizado/menuAdm.css">
<script type="text/javascript" src="js/validaformhotel.js"></script>
</head>

<body>
	<header class="navbar navbar-inverse navbar-fixed-top">
		<c:import url="includes/menuAdm.jsp"></c:import>
	</header>
	<div id="form-hotel">
	<section id="cont-sessao">
		<!-- INICIO DA MAIN -->
		<div id="main" class="container-fluid">
			<h3 class="page-header">Adicionar Hotel</h3>
			<form name="formhotel" action="hotelcontroller.do" method="post">

				<!-- INICIO DO FORMULARIO -->
				<fieldset><legend>Identificação do Hotel</legend>
				<div class="row" >
					<div>
						<input type="hidden" name="txtcodhotel" class="form-control" id="campo1" value="${requestScope.hotel.codhotel}" />
					</div>
				
					<div class="form-group col-md-9">
						<label for="campo1">Nome do Hotel</label> 
						<input type="text" name="txtnome" class="form-control" id="campo1"
							   value="${requestScope.hotel.nome}" />
					</div>
					
					<div class="form-group col-md-3">
						<label for="campo1">Telefone</label> <input type="text"
							name="txttelefone" class="form-control" id="campo1"
							value="${requestScope.hotel.telefone}" />
					</div>
				</div>
				</fieldset>
				
				<fieldset><legend>Endereço do Hotel</legend>
				<div class="row">
					<div class="form-group col-md-3">
						<label for="campo1">CEP</label> <input type="text"
							name="txtcep" class="form-control" id="cep"
							value="${requestScope.hotel.cep}" />
					</div>
					
					<div class="form-group col-md-9">
						<label for="campo1">Rua</label> <input type="text" name="txtendereco"
							class="form-control" id="endereco"
							value="${requestScope.hotel.endereco}" />
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-6">
						<label for="campo1">Bairro</label> <input type="text"
							name="txtbairro" class="form-control" id="bairro"
							value="${requestScope.hotel.bairro}" />
					</div>

					<div class="form-group col-md-3">
						<label for="campo1">Cidade</label> <input type="text" name="txtcidade"
							class="form-control" id="cidade"
							value="${requestScope.hotel.cidade}" />
					</div>

					<div class="form-group col-md-3">
						<label for="campo1">Estado</label> <input type="text"
							name="txtestado" class="form-control" id="estado"
							value="${requestScope.hotel.estado}" />
					</div>
				</div>
				</fieldset>
				
				<fieldset><legend>Informações Adicionais</legend>
				<div class="row">
					 
					<div class="form-group col-md-2">
						<label for="campo1">Quartos</label>
						 <input type="number" name="txtqtdquarto" class="form-control" id="campo1" min="0" value="${requestScope.hotel.qtdquarto}" />
					</div>
					
					<div class="form-group col-md-3">
						<label>Tipo</label>
						<div class="selectContainer">
							<input type="radio" id="tipo-radio1" name="txttipohotel" value="matriz" checked/><label for="tipo-radio1">Matriz</label>
							<input type="radio" id="tipo-radio2" name="txttipohotel" value="filial"/><label for="tipo-radio2">Filial</label>
						</div>
					</div>
					
					<div class="form-group col-md-2">
						<label>Cód. Matriz</label>
						<div class="selectContainer">
							<input type="text" id="codmatriz-1" class="form-control" name="txtcodmatriz" value="${hotel.codmatriz}"/>
						</div>
					</div>
						
					<div class="form-group col-md-5">
						<label>Classificação</label>
						<div class="selectContainer">
							<input type="radio" id="classificacao-radio1" name="txtclassificacao" value="1"/><label for="classificacao-radio1">1 Estrela</label>
							<input type="radio" id="classificacao-radio2" name="txtclassificacao" value="2"/><label for="classificacao-radio2">2 Estrelas</label>
							<input type="radio" id="classificacao-radio3" name="txtclassificacao" value="3" checked/><label for="classificacao-radio3">3 Estrelas</label>
						</div>
					</div>
				</div>
			</fieldset>
			
			<fieldset><legend>Detalhes do Hotel</legend>
				<div class="row">
					<div class="form-group col-md-12">
						<label class=" control-label">Descrição</label>
						<textarea name="txtdescricao" class="form-control" rows="5">${requestScope.hotel.descricao}</textarea>
					</div>
				</div>
			</fieldset>
				<!-- BOTÕES DO FORMULARIO -->
				<hr />
				<div id="actions" class="row">
					<div class="col-md-12">
						<button type="submit" name="btnacao" value="CADASTRAR" class="btn btn-primary" onclick= "validarform();">Salvar</button>
						<a href="hotelcontroller.do?action=LISTAR" class="btn btn-default">Cancelar</a>
					</div>
				</div>
			</form>
		</div>
	</section>
	</div>
	
	<footer id="f1" class="navbar">
		<c:import url="includes/footerAdm.jsp"></c:import>
	</footer>

	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/endereco.js"></script>
</body>
</html>