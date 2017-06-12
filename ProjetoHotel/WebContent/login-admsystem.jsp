<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- CSS do bootstrap -->
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">

<!-- http://fontawesome.io/ -->

<!-- CSS personalizado -->
<link rel="stylesheet" href="lib/css-personalizado/home.css">
<link rel="stylesheet" href="lib/css-personalizado/frmclient.css">

</head>

<body>
	
	<header>
		
		
		<div class="header-black">
		
			<div class="container">
				
				<nav id="menu-header-black">
					
					<ul class="pull-right" class="nav-ul">
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
						<li><a href="#"></a></li>
						<li><a href="index.jsp">Sair - Página Administração</a></li>						
					</ul>
					
				</nav>	
								
			</div>
		
		</div>
	
		<!-- Menu principal -->
 <!-- fim da div do menu adm -->
		
	
		
	
	</header>
	
	<section>
	
		
	
		<div id="banner-adm">
		
		<div class="pull-right">
		
			<h1>Hotel.com<small>Com você sempre é melhor</small></h1>
			
		</div>
		
			<div class="row container">
			
				<div id="form-adm">
				
					<div class="text-center">
						
							<h3>Administrador</h3>
						
					</div>
				
					<form action="autenticadoradm.do" method="post">
						
						<div class="formulario">
					
							<div class="col-md-12">
							
								<label>Login</label>
		   						<input type="text" name="txtemail" placeholder="Digite seu e-mail" value="${requestScope.cliente.email }" class="form-control"/>
							
							</div>
							<div class="col-md-12">
							
								<label>Senha</label>
		   						<input type="password"  name="txtsenha" placeholder="Digite sua senha" value="${requestScope.cliente.senha }" class="form-control"/>
							
							</div>
							
							<div class="text-center">
					
								<div id="criar-conta" class="col-md-12">
									
									<input type="submit" value="Fazer login" class ="btn" />
								
								</div>
								
					
							</div> 
						
						</div>
						
					</form>
					
				</div>
			
			
			</div>
		
			
			
		</div> <!-- fim div class 'banner-frm' -->
	
	</section>
	
	<footer>
	
	
	</footer>
	
	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>