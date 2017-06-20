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
	};
	
	public abstract InterfaceStrategyTipoQuarto obterAcao();
}
