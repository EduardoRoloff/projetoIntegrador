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
<!-- http://fontawesome.io/ -->
<!-- CSS personalizado -->
<link rel="stylesheet" href="lib/css-personalizado/logado-admsystem.css">
</head>

<body>
	<header class="navbar navbar-inverse navbar-fixed-top">
		<!-- barra de navegacao do topo -->

		<c:import url="includes/menuAdm.jsp"></c:import>

		<!-- fim navbar  -->
	</header>

	<section>

		<!-- INICIO DA MAIN -->
		<div id="main" class="container-fluid">
			<h3 class="page-header">Dados do Hotel</h3>

			<form class="container">
				<!-- INICIO DO FORMULARIO -->
				<div class="row">
					<div class="form-group col-md-1">
						<label for="campo1">Código</label> 
						<input type="text" name="txtcodhotel" class="form-control" id="campo1" value="${requestScope.hotel.codhotel}" />
					</div>
					
					<div class="form-group col-md-8">
						<label for="campo1">Nome do Hotel</label> 
						<input type="text" name="txtnome" class="form-control" id="campo1" value="${requestScope.hotel.nome}" />
					</div>
					
					<div class="form-group col-md-3">
						<label for="campo1">Telefone</label> 
						<input type="text" name="txttelefone" class="form-control" id="campo1" value="${requestScope.hotel.telefone}" />
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-3">
						<label for="campo1">CEP</label> 
						<input type="text" name="txtcep" class="form-control" id="cep" value="${requestScope.hotel.cep}" />
					</div>
					
					<div class="form-group col-md-9">
						<label for="campo1">Endereço</label> 
						<input type="text" name="txtendereco" class="form-control" id="endereco" value="${requestScope.hotel.endereco}" />
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-6">
						<label for="campo1">Bairro</label> 
						<input type="text" name="txtbairro" class="form-control" id="bairro" value="${requestScope.hotel.bairro}" />
					</div>

					<div class="form-group col-md-3">
						<label for="campo1">Cidade</label> 
						<input type="text" name="txtcidade" class="form-control" id="cidade" value="${requestScope.hotel.cidade}" />
					</div>

					<div class="form-group col-md-3">
						<label for="campo1">Estado</label> 
						<input type="text" name="txtestado" class="form-control" id="estado" value="${requestScope.hotel.estado}" />
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-4">
						<!-- preencher o espaço -->	
					</div>
					
					<div class="form-group col-md-1">
						<label for="campo1">Quartos</label>
						 <input type="text" name="txtqtdquarto" class="form-control" id="campo1" value="${requestScope.hotel.qtdquarto}" />
					</div>
					
					<div class="form-group col-md-2">
						<label for="campo1">Tipo</label>
						 <input type="text" name="txtqtdquarto" class="form-control" id="campo1" value="${requestScope.hotel.tipohotel}" />
					</div>
					
					<div class="form-group col-md-1">
						<label for="campo1">Classificação</label>
						 <input type="text" name="txtqtdquarto" class="form-control" id="campo1" value="${requestScope.hotel.classificacao}" />
					</div>
					
					<div class="form-group col-md-4">
						<!-- preencher o espaço -->	
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<label class=" control-label">Descrição</label>
						<textarea name="txtdescricao" class="form-control" rows="5">${requestScope.hotel.descricao}</textarea>
					</div>
				</div>
					
					

				<!-- BOTÕES DO FORMULARIO -->
				<hr />
				<div id="actions" class="row">

					<div class="col-md-12">
						<a href="hotelcontroller.do?action=list" class="btn btn-default">Voltar</a>
					</div>

				</div>
				<!-- /#id action class row -->

			</form>

		</div>
		<!-- /#main -->

	</section>

	<footer> 
	
	
	
	</footer>

	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>