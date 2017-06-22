<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <nav class="menu-include" >
			 <div class="container-fluid">
			  <div class="navbar-header">
			   <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			    <span class="sr-only">Toggle navigation</span>
			    <span class="icon-bar"></span>
			    <span class="icon-bar"></span>
			    <span class="icon-bar"></span>
			   </button>
			   
			  </div>
			  <div id="navbar" class="navbar-collapse collapse">
			   <ul>
			    <li><a class="navbar-brand" href="hotelcontroller.do?action=LISTAR">Hotel.com</a></li>
			    <li><a href="#">Opções</a>
			    	<ul>
			    		<li><a href="hotelcontroller.do?action=LISTARFILIAL">Listar Filial</a></li>
			    		<li><a href="hotelcontroller.do?action=LISTARMATRIZ">Listar Matriz</a></li>
			    		<li><a href="quartocontroller.do?action=LISTARTIPOQUARTO">Listar Tipo Quarto</a></li>
			    	</ul>
			    </li>
			    <li><a href="#">Perfil</a></li>
			    <li><a href="#">Ajuda</a></li>
			   </ul>
			  </div>
			 </div>
		</nav>