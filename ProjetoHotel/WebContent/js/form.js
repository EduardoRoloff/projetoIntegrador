function confirmarExclusao(codcliente){
	if(window.confirm("Tem certeza que deseja excluir sua conta?")){
		location.href="ClienteController?action=excluir&codcliente=" + codcliente;
	}
}

function validarFormCadastro(){
	
}
