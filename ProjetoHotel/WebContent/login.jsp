<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link href="css/main.css" rel="stylesheet">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Creative One Page Parallax Template">
	<meta name="keywords" content="Creative, Onepage, Parallax, HTML5, Bootstrap, Popular, custom, personal, portfolio" />
	<meta name="author" content="">	
	<link href="css/prettyPhoto.css" rel="stylesheet">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link href="css/animate.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
	<link href="css/formulario.css" rel="stylesheet">
	<link href="css/login.css" rel="stylesheet">
	<link rel="shortcut icon" href="images/ico/hotelcomlogo.png">
	<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
	<title>Autenticação - Usuário</title>
</head>
<body class="login-page">
	<div>
<%-- 	  <jsp:include page="menuPagina.jsp"/> --%>
<!-- 	  <div class="login-block"> -->
<!-- 		 <form method="post" action="LoginController"> -->
<!-- 			<h1>Fazer Login</h1>	  -->
<!-- 			<input type="text" name="email" placeholder="Email" id="username" value="" required> -->

<!-- 			<input type="password" name="senha" placeholder="Senha" id="password" value=""> -->

<!-- 			<button type="submit" name="action" id="input">Login</button> -->
<!-- 			<br> -->
<!--<%-- 			<label id="erro" name="erro"><c:out value="${error}"/></label> --%>-->
<!-- 		 </form> 	 -->
<!-- 	  </div> -->
	  	<div id="" class="modalLogin login-block">
			<form class="" method="post" action="LoginController">
				<div>
				<h3 class="">Fazer Login</h3>
<!-- 				<span onclick="document.getElementById('id01').style.display='none'" class="close" title="Fechar">&times;</span> -->
<!-- 				<i id="tamanhoUser" class="fa fa-user" aria-hidden="true"></i> -->
				</div>

				<div class="">
<!-- 				<label><b>Email</b></label> -->
				<input type="text" placeholder="Digite seu e-mail" name="email" id="username" required>

<!-- 				<label><b>Senha</b></label> -->
				<input type="password" placeholder="Digite sua senha" name="senha" id="password" required>
					
				<button id="input" type="submit"name="action" value="login">Login</button>
				<br>
				<label id="erro" name="erro"><c:out value="${error}"/></label>
				</div>
			</form>
		</div>
	</div>
	
	<footer id="footer">
		<div class="container">
			<div class="text-center">
				<p>Hotel &copy; 2017 - <a href="">Projeto Faculdade</a> | Fatesg</p>
			</div>
		</div>
	</footer>
	<!--/#footer-->

	
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/smoothscroll.js"></script>
	<script type="text/javascript" src="js/jquery.isotope.min.js"></script>
	<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
	<script type="text/javascript" src="js/jquery.parallax.js"></script>	
</body>
</html>