<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Creative One Page Parallax Template">
	<meta name="keywords" content="Creative, Onepage, Parallax, HTML5, Bootstrap, Popular, custom, personal, portfolio" />
	<meta name="author" content="">	
	<title>Listagem - Quarto</title>
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/prettyPhoto.css" rel="stylesheet">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
	<link rel="shortcut icon" href="images/ico/hotelcomlogo.png">
    <link rel="stylesheet" type="text/css" href="css/resultadoBusca.css"/>
</head>
<body>
	<div class="preloader">
		<div class="preloder-wrap">
			<div class="preloder-inner">
				<div class="ball"></div>
				<div class="ball"></div>
				<div class="ball"></div>
				<div class="ball"></div>
				<div class="ball"></div>
				<div class="ball"></div>
				<div class="ball"></div>
			</div>
		</div>
	</div>	
    <jsp:include page="menuPagina.jsp"/>
    <section>
    <!-- Com divs -->
        <div id="area-principal">
        	<c:forEach items="${quartos}" var="quarto">
            	<div id="listagem">
           			<h3><c:out value="${quarto.nome}"/></h3>
           			<h3><c:out value="${quarto.hotel.codhotel}"/></h3>
                	<img class="imagemRedor" src="<c:url value="${quarto.foto}"/>"/>
                	<span>Descrição: <c:out value="${quarto.descricao}"/>;</span><br><br><br>
                	<span>Quantidade cama: <c:out value="${quarto.quantidadecama}"/>;</span><br><br><br>
                	<span>Quantidade pessoas: <c:out value="${quarto.quantidadepessoa}"/>;</span><br><br><br>
                	<span id="negrito">Valor: R$ <c:out value="${quarto.valordiaria}"/></span>&nbsp&nbsp&nbsp&nbsp
                	<a href="locacaocontroller?action=VISUALIZAR&codhotel=${quarto.hotel.codhotel}&codtipo=${quarto.codtipo}&valorDiaria=${quarto.valordiaria}" class="btn btn-default">EFETUAR LOCACAO</a>
            	</div>
            </c:forEach>
        </div>
     <!-- Fecha com divs -->       
    </section>
	<footer id="footer">
		<div class="container">
			<div class="text-center">
				<p>Hotel &copy; 2017 - <a href="">Projeto Faculdade</a> | Fatesg</p>
			</div>
		</div>
	</footer>
	<!--/#footer-->

    <script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/smoothscroll.js"></script>
	<script type="text/javascript" src="js/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
	<script type="text/javascript" src="js/jquery.parallax.js"></script>
	<script type="text/javascript" src="js/main.js"></script>
</body>
</html>