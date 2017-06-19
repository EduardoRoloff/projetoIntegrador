package br.com.hotel.bll.strategy;

public enum EnumHotel {

	BUSCAR {
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return new BuscarHotelDiaria();
		}
	},
	CADASTRAR {
		@Override
		public InterfaceStrategyTipoQuarto obterAcao() {
			return new CadastrarHotel();
		}
	};
	public abstract InterfaceStrategyTipoQuarto obterAcao();
}
