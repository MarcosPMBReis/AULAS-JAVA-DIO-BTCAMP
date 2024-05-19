package polimorfismo;

public abstract class MenssegerServiceDefault {
		public abstract void enviarMensagem();
		public abstract void receberMensagem();	
		
		protected void salvarHistoricoMensagem() {
			System.out.println("Salvando histórico de mensagens");
		};
		
		protected void validarConectadoInternet() {
			System.out.println("Validando se está conectado a internet");
		}	
}