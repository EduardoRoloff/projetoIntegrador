<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Hotel</title>
<!-- CSS do bootstrap -->
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css"/>
<!-- CSS personalizado -->
<link rel="stylesheet" href="lib/css-personalizado/newcadastroTipoQuarto.css"/>
</head>

<body>
	<header id ="cabecalho-corpo" class="navbar navbar-inverse navbar-fixed-top">
		<!-- barra de navegacao do topo -->
		<c:import url="includes/menuAdm.jsp"></c:import>
	</header>
	<div id="form-quarto" class="container-fluid">
        <section id="cont-sessao">
            <header id="cabecalho-sessao">
                <h3>Formulário de Cadastro</h3>
            </header>
            
        <form method="post" id="form-tpquarto" action="quartocontroller.do"> 
	            <fieldset id="info-hotel">
	                <legend>Hotel</legend>
	                <div class="form-group col-md-2">
		                <label for="id-hotel">Cód. Hotel</label>
		                <input type="text" name="txtcodhotel" id="id-hotel" value="${hotel.codhotel}" readonly/>
	                </div>
	                <div class="form-group col-md-10">
		                <label for="id-nomehotel">Nome do Hotel</label>
		                <input type="text" name="txtnomehotel" id="id-nomehotel" value="${hotel.nome}" readonly/>
	            	</div>
	            </fieldset>
         
            <fieldset id="tp-quarto">
                <legend>Tipo de Quarto</legend>
                <p>Nome do Tipo:<input type="text" name="txtnome" id="id-nome"/></p>
                <label for="id-qtquarto">Quantidade de Quartos:<input type="number" name="txtqtquarto" id="id-qtquarto" min="0" max="500" value="0"></label>      
                <p>Quantidade de Cama:<input type="number" name="txtqtcama" id="id-qtcama" min="0" max="99" value="0"/></p>
                <p>Quantidade de Pessoas:<input type="number" name="txtqtpessoas" id="id-qtpessoass" min="0" max="99" value="0"/></p>
                <p>Valor Diária:<input type="text" name="txtvalor" id="id-valor"/></p>
                <p>Detalhe do Quarto:<textarea name="txtdescricao" id="id-descricao"></textarea></p>
            </fieldset>  
            <hr />
				<div id="actions" class="row">
					<div class="col-md-12">
						<button type="submit" name="btnsalvar" value="SALVAR" class="btn btn-primary" onclick= "">Salvar</button>
						<a href="hotelcontroller.do?action=LISTAR" class="btn btn-default">Cancelar</a>
					</div>
				</div>
        </form>
            
        </section>
	</div>
    <footer id="rodape">
    </footer>
	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>