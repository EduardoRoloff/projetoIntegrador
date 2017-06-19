<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Creative One Page Parallax Template">
	<meta name="keywords" content="Creative, Onepage, Parallax, HTML5, Bootstrap, Popular, custom, personal, portfolio" />
	<meta name="author" content="">	
	<title>Página - Principal</title>
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/prettyPhoto.css" rel="stylesheet">
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
	<link href="css/formulario.css" rel="stylesheet">
	<link rel="shortcut icon" href="images/ico/hotelcomlogo.png">
	<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/smoothness/jquery-ui.min.css" rel="stylesheet" type="text/css" />
    
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
<%
	if(session.getAttribute("usuario") == null){	
%>
	<jsp:include page="menuHome.jsp"/>	  
<% 
	}else if(session.getAttribute("usuario") != null){
%>
	<jsp:include page="menuUsuario.jsp"/>
<% 
	}
%>
	<section id="home">
		<div class="home-pattern"></div>
		<div id="main-carousel" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#main-carousel" data-slide-to="0" class="active"></li>
				<li data-target="#main-carousel" data-slide-to="1"></li>
				<li data-target="#main-carousel" data-slide-to="2"></li>
			</ol>
			<!--/.carousel-indicators-->
			<div class="carousel-inner">
				<div class="item active" style="background-image: url(images/slider/primeira.jpg)">
					<div class="carousel-caption">
						<div>
							<h2 class="heading animated bounceInDown">Faça sua Reserva com a Hotel.com</h2>
							<p class="animated bounceInUp">Melhores preços e ofertas</p>
						</div>
					</div>
				</div>
				<div class="item" style="background-image: url(images/slider/segunda.jpg)">
					<div class="carousel-caption">
						<div>
							<h2 class="heading animated bounceInDown">Hotéis de todos os gostos</h2>
							<p class="animated bounceInUp">Para você e sua família
						</div>
					</div>
				</div>
				<div class="item" style="background-image: url(images/slider/terceira.jpg)">
					<div class="carousel-caption">
						<div>
							<h2 class="heading animated bounceInRight">Faça seu cadastro</h2>
							<p class="animated bounceInLeft">Hotel.com</p>
						</div>
					</div>
				</div>
			</div>
			<!--/.carousel-inner-->

			<a class="carousel-left member-carousel-control hidden-xs" href="#main-carousel" data-slide="prev"><i class="fa fa-angle-left"></i></a>
			<a class="carousel-right member-carousel-control hidden-xs" href="#main-carousel" data-slide="next"><i class="fa fa-angle-right"></i></a>
		</div>

	</section>
	<!--/#home-->

	<!--formulario 122 a 151-->
	<form id="panel" name="frmRequestSmart" id="frmRequestSmart" method="POST" action="hotelcontroller.do">
		<div class="group-form" id="group-form-destination">
			<div class="destinationRow" destid="1">
				<div class="destination" style="width:100%; max-width:100%; min-width:100%;">
					<label>Qual é o seu destino?</label>
					<div class="auto-suggest-placeholder">
						<input type="text" name="Destination1Text" id="txtCity1" placeholder="Destino na cidade" value="" autocomplete="off" required>
					</div>
				</div>
				<li role="separator" class="divider"></li>
				<div class="dates_container">
					<input type="date" name="CheckIn" id="CheckIn">
					<input type="date" name="CheckOut" id="CheckOut">
				</div>
			</div>
		</div>

		<div class="group-form column-left">
			<label>Quartos</label>
				<input class="tamanhoQuartos" type="number" min="1" max="10" step="1" name="qtdQuartos" value="" placeholder="Nº quartos"
				required-message="Especifique o número de quartos" required />
		</div>

		<div class="group-form column-left">
			<label for="aldutos">Adultos</label>
			<input type="number" name="adultos" min="1" max="10" step="1" placeholder="Nº de Adultos"
			required required-message="Espeficique o quantidade de Adultos">
		</div>

		<div class="group-form column-left">
			<label for="criancas">Crianças</label>
			<input type="number" name="criancas" min="0" max="10" step="1" placeholder="Nº de Crianças"
			required-message="Especifique a quantidade de crianças">
		</div>
		<div class="clear"></div>
		
		<button type="submit" class="Submit" name="btnacao" value="BUSCAR" >BUSCAR<i class="fa fa-arrow-right"></i></button>
	</form>
	<!--formulario-->
	

	<section id="about-us">
		<div class="container">
			<div class="text-center">
				<div class="col-sm-8 col-sm-offset-2">
					<h2 class="title-one">Hotel.com</h2>
					<p>Confira os melhores hotéis para as suas férias! Planeje uma viagem de negócios, uma lua de mel, ou um fim de semana
						na praia. Viaje com as crianças, sozinho, ou acompanhado em uma viagem romântica. Hospede-se em hotéis que aceitam
						animais, hotéis com academia, hotéis com wi-fi, hotéis de luxo.
					</p>
				</div>
			</div>
			<div class="about-us">
				<div class="row">
					<div class="col-sm-6">
						<h3>Hotel.com</h3>
						<ul class="nav nav-tabs">
							<li class="active"><a href="#about" data-toggle="tab"><i class="fa fa-chain-broken"></i> A Hotel.com</a></li>
							<li><a href="#mission" data-toggle="tab"><i class="fa fa-th-large"></i> Missão</a></li>
							<li><a href="#community" data-toggle="tab"><i class="fa fa-users"></i> Você na Hotel.com</a></li>
						</ul>
						<div class="tab-content">
							<div class="tab-pane fade in active" id="about">
								<div class="media">
									<img class="pull-left media-object" src="images/about-us/hotelcom.png" alt="about us">
									<div class="media-body">
										<p>A Hoteis.com oferece reservas de hotéis, oferecendo serviços de reservas através de sua própria rede de sites localizados.</p>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="mission">
								<div class="media">
									<img class="pull-left media-object" src="images/about-us/mission.png" alt="Mission">
									<div class="media-body">
										<p>A missão da Hotel.com é oferecer aos viajantes uma das mais amplas seleções de acomodação da internet, incluindo
											hotéis independentes e grandes redes hoteleiras.
										</p>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="community">
								<div class="media">
									<img class="pull-left media-object" src="images/about-us/hotelcom.png" alt="Community">
									<div class="media-body">
										<p>Na Hotel.com você terá acesso aos hoteis, para fazer sua reserva e curtir muito sua viagem!</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-6">
						<h3>Lugares mais Procurados</h3>
						<div class="skill-bar">
							<div class="skillbar clearfix " data-percent="90%">
								<div class="skillbar-title">
									<span>Rio de Janeiro - RJ</span>
								</div>
								<div class="skillbar-bar"></div>
								<div class="skill-bar-percent">90%</div>
							</div>
							<!-- End Skill Bar -->
							<div class="skillbar clearfix" data-percent="85%">
								<div class="skillbar-title"><span>Foz do Iguaçu - PR</span></div>
								<div class="skillbar-bar"></div>
								<div class="skill-bar-percent">85%</div>
							</div>
							<!-- End Skill Bar -->
							<div class="skillbar clearfix " data-percent="75%">
								<div class="skillbar-title"><span>Fortaleza - CE</span></div>
								<div class="skillbar-bar"></div>
								<div class="skill-bar-percent">75%</div>
							</div>
							<!-- End Skill Bar -->
							<div class="skillbar clearfix " data-percent="70%">
								<div class="skillbar-title"><span>Recife - PE</span></div>
								<div class="skillbar-bar"></div>
								<div class="skill-bar-percent">70%</div>
							</div>
							<!-- End Skill Bar -->
							<div class="skillbar clearfix " data-percent="65%">
								<div class="skillbar-title"><span>Gramado - RS</span></div>
								<div class="skillbar-bar"></div>
								<div class="skill-bar-percent">65%</div>
							</div>
							<!-- End Skill Bar -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/#about-us-->

	<section id="services" class="parallax-section">
		<div class="container">
			<div class="row text-center">
				<div class="col-sm-8 col-sm-offset-2">
					<h2 class="title-one">Serviços</h2>
					<p>Alguns de nossos hotéis terão serviços para melhorar seu comforto</p>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<div class="our-service">
						<div class="services row">
							<div class="col-sm-4">
								<div class="single-service">
									<!--<i class="fa fa-th"></i>-->
									<i><img class="fa fa-users" src="images/services/wifi1.png" alt="wifi"></i>
									<h2>Wifi</h2>
									<p>Nossos hotéis oferecem quartos com redes WIFI para você estar conectado e compartilhar seus momentos. Com diversos
										tipos de velocidade e acalnçe. Veja se o hotel que for se hospedar possuí o benefício da Rede WIFI.
									</p>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="single-service">
									<!--<i class="fa fa-html5"></i>-->
									<i><img class="fa fa-users" src="images/services/refeicao.png" alt="refeicao"></i>
									<h2>Refeições</h2>
									<p>Nossos hotéis oferecem refeições como café da manhã, almoço e janta onde você pode saborear pratos da culinária
										local e degustar as bebidas também estarão disponíveis. Veja se o hotel que for se hospedar possuí o benefício
										de Refeição. Lembrando que alguns hotéis não oferecem as três refeições.
									</p>
								</div>
							</div>
							<div class="col-sm-4">
								<div class="single-service">

									<i><img class="fa fa-users" src="images/services/garagem.png" alt="garagem"></i>
									<h2>Garagem</h2>
									<p>Nosso hotéis oferecem garagens para você estar estacionando seu veículo com segurança. Veja se o hotel que for se
										hospedar possuí o benefício de Garagem.
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/#service-->

	<section id="our-team">
		<div class="container">
			<div class="row text-center">
				<div class="col-sm-8 col-sm-offset-2">
					<h2 class="title-one">Hotéis</h2>
					<p>
						<h3>Veja alguns de nosso hotéis onde você pode se hospedar por um bom preço.</h3>
					</p>
				</div>
			</div>
			<div id="team-carousel" class="carousel slide" data-interval="false">
				<a class="member-left" href="#team-carousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
				<a class="member-right" href="#team-carousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
				<div class="carousel-inner team-members">
					<div class="row item active">
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/primeira.jpg" alt="team member" />
								<h4>Hotel Alpes</h4>
								<h5>Gramado - RS</h5>
								<p>Localizado em Gramado, o encantador Hotel Alpes fica a 2 quarteirões da Rua Coberta e do Palácio dos Festivais.</p>
								<h5>R$ 190,00 diária</h5>
								<p>Incluso Café da manhã</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/segunda.jpg" alt="team member" />
								<h4>Alekjandra Jony</h4>
								<h5>Creative Designer</h5>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/terceira.jpg" alt="team member" />
								<h4>Paul Johnson</h4>
								<h5>Skilled Programmer</h5>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/quarta.jpg" alt="team member" />
								<h4>John Richerds</h4>
								<h5>Marketing Officer</h5>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
					<div class="row item">
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/quinta.jpg" alt="team member" />
								<h4>William Hurt</h4>
								<h5>Sr. Web Developer</h5>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/sexta.jpg" alt="team member" />
								<h4>Paul Johnson</h4>
								<h5>Skilled Programmer</h5>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/setima.jpg" alt="team member" />
								<h4>Alekjandra Jony</h4>
								<h5>Creative Designer</h5>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-3">
							<div class="single-member">
								<img src="images/hoteis/oitava.jpg" alt="team member" />
								<h4>John Richerds</h4>
								<h5>Marketing Officer</h5>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod</p>
								<div class="socials">
									<a href="#"><i class="fa fa-facebook"></i></a>
									<a href="#"><i class="fa fa-twitter"></i></a>
									<a href="#"><i class="fa fa-google-plus"></i></a>
									<a href="#"><i class="fa fa-dribbble"></i></a>
									<a href="#"><i class="fa fa-linkedin"></i></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/#Our-Team-->

	<section id="portfolio">
		<div class="container">
			<div class="row text-center">
				<div class="col-sm-8 col-sm-offset-2">
					<h2 class="title-one">Pra onde vou?</h2>
					<p>
						<h3>Escolha um lugar do seu melhor gosto.</h3>
					</p>
				</div>
			</div>
			<ul class="portfolio-filter text-center">
				<li><a class="btn btn-default active" href="#" data-filter="*">Todos</a></li>
				<li><a class="btn btn-default" href="#" data-filter=".praia">Praia</a></li>
				<li><a class="btn btn-default" href="#" data-filter=".pousada">Pousada</a></li>
				<li><a class="btn btn-default" href="#" data-filter=".clube">Clube</a></li>
				<li><a class="btn btn-default" href="#" data-filter=".cultura">Cultura</a></li>
			</ul>
			<!--/#portfolio-filter-->
			<div class="portfolio-items">
				<div class="col-sm-3 col-xs-12 portfolio-item praia">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/1.jpg" alt=""></div>
						<div class="mask text-center">
							<h3>Praia de Pajuçara</h3>
							<h4>Maceio - AL</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/111.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item clube">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/2.jpg" alt="">
						</div>
						<div class="mask text-center">
							<h3>Resort HotPark</h3>
							<h4>Caldas Novas - GO</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/21.png" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item pousada">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/3.jpg" alt="">
						</div>
						<div class="mask text-center">
							<h3>Pousada Aloha Brasil</h3>
							<h4>Praia do Forte – BA</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/31.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item cultura">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/4.jpg" alt="">
						</div>
						<div class="mask text-center">
							<h3>Pelourinho</h3>
							<h4>Salvador - BA </h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/41.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item praia">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/5.jpg" alt="">
						</div>
						<div class="mask text-center">
							<h3>Praia Porto de Galinhas</h3>
							<h4>Ipojuca - PE</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/51.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item pousada">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/6.jpg" alt="">
						</div>
						<div class="mask text-center">
							<h3>Parque de Ibitipoca</h3>
							<h4>Conceição do Ibitipoca – MG</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/61.png" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item praia">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/7.jpg" alt="">
						</div>
						<div class="mask text-center">
							<h3>Praia do Farol</h3>
							<h4>Arraial do Cabo - RJ</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/71.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item clube">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/8.jpg" alt=""></div>
						<div class="mask text-center">
							<h3>Peninsula Beach Club Hotel</h3>
							<h4>Barra Grande - BA</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/81.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item praia">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/9.jpg" alt="">
						</div>
						<div class="mask text-center">
							<h3>Praia dos Carneiros</h3>
							<h4>Tamandaré - PE</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/91.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item pousada">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/10.jpg" alt=""></div>
						<div class="mask text-center">
							<h3>Vila Brasil</h3>
							<h4>Petropolis - RJ</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/101.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item clube">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/11.jpg" alt=""></div>
						<div class="mask text-center">
							<h3>Oceani Beach Park Hotel</h3>
							<h4>Aquiraz - CE</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/1111.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
				<div class="col-sm-3 col-xs-12 portfolio-item cultura">
					<div class="view efffect">
						<div class="portfolio-image">
							<img src="images/portfolio/12.jpg" alt=""></div>
						<div class="mask text-center">
							<h3>Hotel Sky</h3>
							<h4>Gramado - RS</h4>
							<a href="#"><i class="fa fa-link"></i></a>
							<a href="images/portfolio/121.jpg" data-gallery="prettyPhoto"><i class="fa fa-search-plus"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>

	</section>
	<!--/#portfolio-->

	<section id="clients" class="parallax-section">
		<div class="container">
			<div class="clients-wrapper">
				<div class="row text-center">
					<div class="col-sm-8 col-sm-offset-2">
						<h2 class="title-one">Clients Say About Us</h2>
						<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore
							magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit. Lorem
							ipsum dolor sit amet, consectetuer adipiscing elit</p>
					</div>
				</div>
				<div id="clients-carousel" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#clients-carousel" data-slide-to="0" class="active"></li>
						<li data-target="#clients-carousel" data-slide-to="1"></li>
						<li data-target="#clients-carousel" data-slide-to="2"></li>
					</ol>
					<!-- Wrapper for slides -->
					<div class="carousel-inner">
						<div class="item active">
							<div class="single-client">
								<div class="media">
									<img class="pull-left" src="" alt="">
									<div class="media-body">
										<blockquote>
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante. Lorem ipsum dolor sit amet,
												consectetur adipiscing elit. Integer posuere erat a ante.</p><small>Someone famous in Source Title</small><a
												href="">www.yourwebsite.com</a></blockquote>
									</div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="single-client">
								<div class="media">
									<img class="pull-left" src="" alt="">
									<div class="media-body">
										<blockquote>
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante. Lorem ipsum dolor sit amet,
												consectetur adipiscing elit. Integer posuere erat a ante.</p><small>Someone famous in Source Title</small><a
												href="">www.yourwebsite.com</a></blockquote>
									</div>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="single-client">
								<div class="media">
									<img class="pull-left" src="" alt="">
									<div class="media-body">
										<blockquote>
											<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante. Lorem ipsum dolor sit amet,
												consectetur adipiscing elit. Integer posuere erat a ante.</p><small>Someone famous in Source Title</small><a
												href="">www.yourwebsite.com</a></blockquote>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--/#clients-->

	<footer id="footer">
		<div class="container">
			<div class="text-center">
				<p>Hotel &copy; 2017 - Projeto Faculdade | <a href="login-admsystem.jsp">Área da Administração</a> | Fatesg</p>
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
	<script type="text/javascript" src="js/dataCheckinCheckout.js"></script>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
</body>
</html>