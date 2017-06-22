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
	<title>Resultado - Busca Hotel</title>
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
        	<c:forEach items="${hoteis}" var="hotel">
            	<div id="listagem">
           			<h3><c:out value="${hotel.nome}"/></h3>
                	<img class="imagemRedor" src="<c:url value="${hotel.foto}"/>"/>
                	<span><c:out value="${hotel.endereco}"/>,</span> 
                	<span><c:out value="${hotel.bairro}"/>,</span>
                	<span><c:out value="${hotel.cidade}"/>,</span>
                	<span><c:out value="${hotel.cep}"/>,</span>
                	<span><c:out value="${hotel.estado}"/>.</span><br><br><br>
                	<span><c:out value="${hotel.descricao}"/></span><br><br><br>
                	<span>Classificação: <c:out value="${hotel.classificacao}"/></span><br><br><br>
                	<a href="quartocontroller.do?action=SELECIONAR&codhotel=${hotel.codhotel}&qtdDias=${hotel.qtdDias}" class="btn btn-default">SELECIONAR</a>
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