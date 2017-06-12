
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Localo Hotel</title>
<!-- CSS do bootstrap -->
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
<!-- CSS personalizado -->
<link rel="stylesheet" href="lib/css-personalizado/logado-admsystem.css">

</head>

<body>

	<header class="navbar navbar-inverse navbar-fixed-top">
		<!-- barra de navegacao do topo -->
		<c:import url="includes/menuAdm.jsp"></c:import>
		<!-- fim navbar  -->
	</header>

	<section id="element" class="container">
	
		<div  class="form-group col-md-4 selectContainer">
			<label>Estado</label> 
				<select class="form-control" name="txtid">
					<option value="">Selecione...</option>
					<c:forEach var="estado" items="${list}">
						<option value="${estado.id}">
						     ${estado.nome}
						</option>
					</c:forEach>
				</select>
		</div>	
		
		<div class="col-md-4">
				  <a href="cidadescontroller.do?action=list" class="btn btn-primary pull-right h2">OK</a>
		</div>
		
		<div id="loc" class="center" class="row">
			<h1></h1>
			<div id="map" style="width: 400px; height: 400px; background: yellow"></div>

			<script type="text/javascript">
				function myMap() {
					var mapCanvas = document.getElementById("map");
					var mapOptions = {
						center : new google.maps.LatLng(51.5, -0.2),
						zoom : 10
					};
					var map = new google.maps.Map(mapCanvas, mapOptions);
				}
			</script>

			<script
				src="https://maps.googleapis.com/maps/api/js?key= AIzaSyCMP9Mvy7Dyl1GE3OrhQXGbJTsmyDxO0fE&callback=myMap"></script>
			<!--
					To use this code on your website, get a free API key from Google.
					Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
					-->
		</div>
	</section>

	<footer>
		
	 </footer>

	<script src="lib/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
