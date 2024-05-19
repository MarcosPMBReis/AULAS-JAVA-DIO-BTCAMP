package polimorfismo;

public class FacebookMensseger extends MenssegerServiceDefault{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
		salvarHistoricoMensagem();
	}
}
