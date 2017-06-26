package br.com.hotel.bll.pattern.tipoquarto;

public enum EnumFactoryTipoQuarto {
	
	CADASTRAR {
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return new CadastrarTipoQuarto();
		}
	},
	ATUALIZAR {
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return null;
		}
	},
	SALVAR {
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return new SalvarTipoQuarto();
		}
	},
	SELECIONAR{
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return new ListarQuartoBusca();
		}
	},
	LISTARTIPOQUARTO{
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return new ListarTipoQuartoAdm();
		}
	},DELETAR {
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return new DeletarTipoQuarto();
		}
	};
	
	public abstract InterfaceStrategyTipoQuarto obterAcao();
}
