<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
	<link href="css/formulario.css" rel="stylesheet">
	<link rel="shortcut icon" href="images/ico/hotelcomlogo.png">
</head>
<body>
		   <header id="navigation">
					<div class="navbar navbar-inverse navbar-fixed-top" role="banner">
						<div class="container">
							<div class="navbar-header">
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
								</button>
									<a class="navbar-brand" href="index.html">
									<h1><img src="images/logo2.png" id="tamanhoLogo" alt="logo"></h1>
									</a>
					</div>
					<div class="collapse navbar-collapse" id="tamanhoMenu">
						<ul class="nav navbar-nav navbar-right">
							<li class="scroll active"><a href="#navigation">Home</a></li>
							<li class="scroll"><a href="#services">Serviços</a></li>
							<li class="scroll"><a href="#our-team">Hotéis</a></li>
							<li class="scroll"><a href="#portfolio">Pra onde vou?</a></li>
							<li class="scroll"><a href="#clients">Promoções</a></li>
						</ul>
					</div>
					<div class="dropdown" id="posicaoLogin">
						<a class="btn dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							LOGIN | CRIAR CONTA
							<span class="caret"></span>
						</a>
					<ul class="dropdown-menu">
						<li><a href="LoginController?action=login">Fazer Login</li>
						<li><a href="ClienteController?action=criar">Criar Conta</a></li>
						<li><a href="ReservasController?action=listar">Suas Reservas</a></li>
					</ul>
				</div>
			</div>
		</div>
	</header>
</body>
</html>