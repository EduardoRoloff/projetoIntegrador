<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  	
	
	
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Adminstração</title>

	<!-- CSS do bootstrap -->
	<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
	
	<!-- http://fontawesome.io/ -->
	
	<!-- CSS personalizado -->
	<link rel="stylesheet" href="lib/css-personalizado/logado-admsystem.css">
	<link href="css/style.css" rel="stylesheet">

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

	<!-- CAIXA DE BUSCA -->		 		
			 <div id="top" class="row">
			    <div class="col-md-3">
			        <h2>Itens</h2>
			    </div>
			 <form action="hotelcontroller.do" method="post" >
			    <div class="col-md-6" >
			        <div class="input-group h2">
			            <input name="data" class="form-control" id="search" type="text" placeholder="Pesquisar Itens">
			            <span class="input-group-btn">
			               <button class="btn btn-primary" type="submit" name="txtpeq" value="pesq">
			                    <span class="glyphicon glyphicon-search"></span>
			                </button>
			            </span>
			        </div>
			    </div>
			 </form>
			    <div class="col-md-3">
			        <a href="hotelcontroller.do?action=new" class="btn btn-primary pull-right h2">Novo</a>
			    </div>
			</div> <!-- /#top -->
	
	<!--================================================================================ -->
	<!-- INICIO DA TABELA -->
			<div id="list" class="row">
			 
			    <div class="table-responsive col-md-12">
			        <table class="table table-striped" cellspacing="0" cellpadding="0">
			            <thead>
			                <tr>
			                    <th>Código</th>
			                    <th>Nome</th>
			                    <th>Cidade</th>
			                    <th>Estado</th>
			                    <th class="actions">Ações</th>
			                 </tr>
			            </thead>
			            
			            <c:forEach items="${listHotel}" var="hotel">
				            <tbody>
				 
				                <tr>
				                    <td>${hotel.codhotel}</td>
				                    <td>${hotel.nome}</td>
				                    <td>${hotel.cidade}</td>
				    				<td>${hotel.estado}</td>
				                    
				                    <td class="actions">
				                        <a class="btn btn-success btn-xs" href="hotelcontroller.do?action=view&txtcodhotel=${hotel.codhotel}">Visualizar</a>
				                        <a class="btn btn-warning btn-xs" href="hotelcontroller.do?action=update&txtcodhotel=${hotel.codhotel}">Editar</a>
				                        <a class="btn btn-danger btn-xs"  href="hotelcontroller.do?action=del&txtcodhotel=${hotel.codhotel}">Excluir</a>
				                    </td>
				                </tr>
				 
				            </tbody>
			            
			            </c:forEach>
			            
			         </table>
			 
			     </div>
			 </div> <!-- /#list -->
	 
		</div>  <!-- /#main -->
		
	</section>
	
	<footer>
	
	</footer>	
		
	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>