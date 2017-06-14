function validarform(){
	var nome = formhotel.txtnome.value;
	var telefone = formhotel.txttelefone.value;
	var cep = formhotel.txtcep.value;
	var quartos = formhotel.txtquartos.value;
	var classificacao = formhotel.txtclassificacao.value;
	var descricao = formhotel.txtdescricao.value;
	
	if(nome == ""){
		alert("Por favor, preencha o campo -nome!");
		formhotel.nome.focus();
		return false;
	}
	
	
}