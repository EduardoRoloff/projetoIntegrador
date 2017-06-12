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

			<h3 class="page-header">Adicionar Hotel</h3>

			<form class="container">

				<!-- INICIO DO FORMULARIO -->
				<div class="row">
					
					<div class="form-group col-md-2">
						<label for="campo1">Código</label> 
						<input type="text" name="txtcodhotel" class="form-control" id="campo1" value="${requestScope.hotel.codhotel}" />
					</div>
					
					<div class="form-group col-md-10">
						<label for="campo1">Nome do Hotel</label> 
						<input type="text" name="txtnome" class="form-control" id="campo1" value="${requestScope.hotel.nome}" />
					</div>

				</div>

				<div class="row">

					<div class="form-group col-md-7">
						<label for="campo1">Rua</label> 
						<input type="text" name="txtrua" class="form-control" id="campo1" value="${requestScope.hotel.rua}" />
					</div>

					<div class="form-group col-md-5">
						<label for="campo1">Bairro</label> 
						<input type="text" name="txtbairro" class="form-control" id="campo1" value="${requestScope.hotel.bairro}" />
					</div>

				</div>

				<div class="row">


					<div class="form-group col-md-2">
						<label for="campo1">Quadra</label> 
						<input type="text" name="txtquadra" class="form-control" id="campo1" value="${requestScope.hotel.quadra}" />
					</div>

					<div class="form-group col-md-2">
						<label for="campo1">Lote</label> 
						<input type="text" name="txtlote" class="form-control" id="campo1" value="${requestScope.hotel.lote}" />
					</div>

					<div class="form-group col-md-1">

						<label for="campo1">Numero</label> 
						<input type="text" name="txtnumero" class="form-control" id="campo1" value="${requestScope.hotel.numero}" />

					</div>

					<div class="form-group col-md-5">

						<label>Cidade</label>
						<div class="selectContainer">
							<select class="form-control" name="size">
								<option value="">Choose a size</option>
								<option value="s">Small (S)</option>
								<option value="m">Medium (M)</option>
								<option value="l">Large (L)</option>
								<option value="xl">Extra large (XL)</option>
							</select>
						</div>

					</div>

					<div class="form-group col-md-2">

						<label>Estado</label>
						<div class="selectContainer">
							<select class="form-control" name="size">

								<option value="">Choose a size</option>
								<option value="s">Small (S)</option>
								<option value="m">Medium (M)</option>
								<option value="l">Large (L)</option>
								<option value="xl">Extra large (XL)</option>

							</select>
						</div>

					</div>

				</div>

				<div class="row">

					<div class="form-group col-md-12">
						<label class=" control-label">Descrição</label>
						<textarea name="txtdescricao" class="form-control" rows="5" >${requestScope.hotel.descricao}</textarea>
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