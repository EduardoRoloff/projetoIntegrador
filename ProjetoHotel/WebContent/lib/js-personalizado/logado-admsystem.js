/**
 * 
 */
function confirmarExclusao(id){
	if(window.confirm("Deseja realmente excluir?")){
		location.href="hotelcontroller.do?action=DELETAR&txtcodhotel="+id;
		alert("Excluido com sucesso!")
	}
}