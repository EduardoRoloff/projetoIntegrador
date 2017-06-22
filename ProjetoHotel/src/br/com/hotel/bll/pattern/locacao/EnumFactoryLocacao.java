package br.com.hotel.bll.pattern.locacao;


public enum EnumFactoryLocacao {
	
	VISUALIZAR{
		@Override
		public InterfaceStrategyLocacao obterAcao() {
			// TODO Auto-generated method stub
			return new VisualizarLocacao();
		}
	},
	
	LOCAR{

		@Override
		public InterfaceStrategyLocacao obterAcao() {
			// TODO Auto-generated method stub
			return new EfetuarLocacao();
		}
		
	};
	
	public abstract InterfaceStrategyLocacao obterAcao();
}
