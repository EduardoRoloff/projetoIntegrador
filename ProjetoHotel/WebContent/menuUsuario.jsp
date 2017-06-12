<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
							<!--<li class="scroll"><a href="#about-us">Lugares Procurados<Us></Us></a></li>-->
							<li class="scroll"><a href="#services">Serviços</a></li>
							<li class="scroll"><a href="#our-team">Hotéis</a></li>
							<li class="scroll"><a href="#portfolio">Pra onde vou?</a></li>
							<li class="scroll"><a href="#clients">Promoções</a></li>
							<!--<li class="scroll"><a href="#blog">Opniões</a></li>-->
							<!--<li class="scroll"><a href="#contact">Faça sua Reserva</a></li>-->
						</ul>
					</div>
						<div class="dropdown" id="posicaoLogin">
							<a class="btn dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							LOGIN | Bem-Vindo <label id="nomeLogin"><c:out value="${usuario.nome}"/></label>
							<span class="caret"></span>
							</a>
						<ul class="dropdown-menu">
							<li><a href="ClienteController?action=minhaConta">Minha Conta</a><li>
							<li><a href="ClienteController?action=Reservas">Minhas Reservas</a></li>
							<li><a href="LoginController?action=logout">Logout</a></li>
						</ul>
					</div>
				</div>
			</div>
		</header>
</body>
</html>