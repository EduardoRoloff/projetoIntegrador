package br.com.hotel.bll.strategy;

public enum RequisicaoQuartoController {
	
	CADASTRAR {
		@Override
		public InterfaceStrategyQuarto obterAcao() {
			return new CadastrarQuarto();
		}
	},
	ATUALIZAR {
		@Override
		public InterfaceStrategyQuarto obterAcao() {
			return null;
		}
	},
	SALVAR {
		@Override
		public InterfaceStrategyQuarto obterAcao() {
			return new SalvarTipoQuarto();
		}
	};

	public abstract InterfaceStrategyQuarto obterAcao();
}
