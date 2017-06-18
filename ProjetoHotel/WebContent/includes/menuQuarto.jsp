<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

           <fieldset id="info-hotel">
                <legend>Hotel</legend>
                <label for="id-hotel">Cód. Hotel</label>
                <input type="text" name="txtcodhotel" id="id-hotel" value="${hotel.codhotel}" readonly/>
                <label for="id-nomehotel">Nome do Hotel</label>
                <input type="text" name="txtnomehotel" id="id-nomehotel" value="${hotel.nome}" readonly/>
            </fieldset>
            <fieldset id="tp-quarto">
                <legend>Tipo de Quarto</legend>
                <p>Código do Tipo:<input type="text" name="txtcodtipo" id="id-codtipo" readonly/></p>
                <p>Nome do Tipo:<input type="text" name="txtnome" id="id-nome" readonly/></p>   
                <p>Quantidade de Cama:<input type="text" name="txtqtcama" id="id-qtcama" value="" readonly/></p>
                <p>Quantidade de Pessoas:<input type="text" name="txtqtpessoas" id="id-qtpessoass" value="" readonly/></p>
                <p>Valor Diária:<input type="text" name="txtvalor" id="id-valor" readonly/></p>
            </fieldset>  