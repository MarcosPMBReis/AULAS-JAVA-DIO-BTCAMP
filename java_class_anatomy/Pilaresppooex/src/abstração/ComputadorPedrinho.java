package abstração;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MsnMensseger msn = new MsnMensseger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}