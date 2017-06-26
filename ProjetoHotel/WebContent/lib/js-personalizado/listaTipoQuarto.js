/**
 * 
 */
function confirmarExclusao(id){
	if(window.confirm("Deseja realmente excluir?")){
		location.href="quartocontroller.do?action=DELETAR&txtcodtipo="+id;
	}
}