package br.com.hotel.bll.strategy;

public enum EnumTipoQuarto {
	
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
	};

	public abstract InterfaceStrategyTipoQuarto obterAcao();
}
