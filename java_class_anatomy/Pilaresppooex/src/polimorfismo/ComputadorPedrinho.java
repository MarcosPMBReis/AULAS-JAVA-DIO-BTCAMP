package polimorfismo;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		MenssegerServiceDefault smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="fbm"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MsnMensseger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMensseger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}