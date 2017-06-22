<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar Quarto</title>
<!-- CSS do bootstrap -->
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css"/>
<!-- CSS personalizado -->
<link rel="stylesheet" href="lib/css-personalizado/"/>
</head>

<body>
	<header id ="cabecalho-corpo" class="navbar navbar-inverse navbar-fixed-top">
		<!-- barra de navegacao do topo -->
		<c:import url="includes/menuAdm.jsp"></c:import>
	</header>
	<div id="form-quarto">
        <section id="cont-sessao">
            <header id="cabecalho-sessao">
                <h3>Formulário de Cadastro</h3>
            </header>
			<form method="post" id="form-tpquarto" action="quartocontroller.do">
				<!-- informacoes sober hotel e tipo de quarto -->
		        <c:import url="includes/menuQuarto.jsp"></c:import>
		        
		        <fieldset>
		        	<legend>Quarto</legend>
		        	<label>Numero do </label>
		        	
		        </fieldset>
			</form>
			
        </section>
	</div>
    <footer id="rodape">
    </footer>
	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>