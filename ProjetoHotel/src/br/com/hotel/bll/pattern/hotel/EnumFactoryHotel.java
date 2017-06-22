package br.com.hotel.bll.pattern.hotel;

public enum EnumFactoryHotel {

	BUSCAR {
		@Override
		public InterfaceStrategyHotel obterAcao() {
			return new BuscarHotelDiaria();
		}
	},CADASTRAR {
		@Override
		public InterfaceStrategyHotel obterAcao() {
			return new CadastrarHotel();
		}
	},ATUALIZAR {
		@Override
		public InterfaceStrategyHotel obterAcao() {
			return new AtualizarHotel();
		}
	},DELETAR {
		@Override
		public InterfaceStrategyHotel obterAcao() {
			return new DeletarHotel();
		}
	},LISTAR {
		@Override
		public InterfaceStrategyHotel obterAcao() {
			return new ListarHotel();
		}
	},NOVO {
		@Override
		public InterfaceStrategyHotel obterAcao() {
			return new LimpaDadosHotel();
		}
	},VISUALIZAR {
		@Override
		public InterfaceStrategyHotel obterAcao() {
			return new VisualizaDadosHotel();
		}
	};
	public abstract InterfaceStrategyHotel obterAcao();
}
