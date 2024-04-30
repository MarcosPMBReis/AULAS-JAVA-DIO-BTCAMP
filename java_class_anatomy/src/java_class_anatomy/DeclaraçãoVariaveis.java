package java_class_anatomy;

public class DeclaraçãoVariaveis {
	public static void main(String[] args) {

		String meuNome = "Marcos";
		int anoFabricacao = 2022;
		boolean simNão = true;
		
		String nome01 = "Marcos";
		String nome02 = "Reis";
		
		String nomeCompleto = nomeCompleto(nome01,nome02);
		
		System.out.println("O meu nome completo é " + nomeCompleto);

	}

	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
}
