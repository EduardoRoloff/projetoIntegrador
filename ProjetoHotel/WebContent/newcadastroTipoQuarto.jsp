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
<link rel="stylesheet" href="lib/css-personalizado/newcadastroTipoQuarto.css">
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
			<h3 class="page-header">Adicionar Tipo de Quarto</h3>
			<form name="formhotel" action="hotelcontroller.do" method="post">

				<!-- INICIO DO FORMULARIO -->
				<fieldset id="info-hotel"><legend>Informação do Hotel</legend>
				<div class="row" >
					<div class="form-group col-md-3">
						<label for="campo1">Cód. Hotel</label> 
						<input type="text" name="txtcodhotel" class="form-control" id="id-hotel"
							   value="${hotel.codhotel}" readonly/>
					</div>
					<div class="form-group col-md-9">
						<label for="campo1">Nome do Hotel</label> 
						<input type="text" name="txtnomehotel" class="form-control" id="id-nomehotel"
							   value="${hotel.nome}" readonly/>
					</div>
				</div>
				</fieldset>
				
				<fieldset><legend>Tipo de Quarto</legend>
				<div class="row">
					<div class="form-group col-md-9">
						<label for="id-nome">Nome do Tipo</label> <input type="text"
							name="txtnome" class="form-control" id="id-nome"
							value="" />
					</div>
					
					<div class="form-group col-md-3">
						<label for="id-valor">Valor da Diária</label> <input type="text" name="txtvalor"
							class="form-control" id="id-valor"
							value="" />
					</div>
				</div>
				</fieldset>
				
				<fieldset><legend>Informações Adicionais</legend>
				<div class="row">
					<div class="form-group col-md-4">
						<!-- preencher o espaço -->	
					</div>	
					<div class="form-group col-md-2">
						<label for="id-qtcama">Quantidade de Cama</label>
						 <input type="number" name="txtqtcama" class="form-control" id="id-qtcama" min="0" max="99" value="0" />
					</div>
					
					<div class="form-group col-md-2">
						<label for="id-qtpessoass">Quantidade de Ocupantes</label>
						<div class="selectContainer">
							<input type="number" id="id-qtpessoass" name="txtqtpessoas" class="form-control" min="0" max="99" value="0"/>
						</div>
					</div>
					<div class="form-group col-md-4">
						<!-- preencher o espaço -->	
					</div>
				</div>
			</fieldset>
			
			<fieldset><legend>Detalhes do Quarto</legend>
				<div class="row">
					<div class="form-group col-md-12">
						<label class=" control-label">Descrição</label>
						<textarea name="txtdescricao" class="form-control" rows="5" id="id-descricao"></textarea>
					</div>
				</div>
			</fieldset>

				<!-- BOTÕES DO FORMULARIO -->
				<hr />
				<div id="actions" class="row">
					<div class="col-md-12">
						<button type="submit" name="btnsalvar" value="SALVAR" class="btn btn-primary" onclick= "">Salvar</button>
						<a href="hotelcontroller.do?action=LISTAR" class="btn btn-default">Cancelar</a>
					</div>
				</div>
		</form>
		</div>
	</section>
	</div>
	<footer id="f1"></footer>

	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>