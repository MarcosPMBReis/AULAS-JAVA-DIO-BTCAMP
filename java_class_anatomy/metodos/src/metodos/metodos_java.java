package metodos;

public class metodos_java {
	public static void main(String[] args) throws Exception {
		//Deve ser nomeado como verbo
		// camelCase
		// ex: somar (int n1, int n2) {}
		// findById (int id) {}
		
		//Caso o metodo não retorne nenhum valor ele será representado pela palavra chave void
		
	SmartTv samsung = new SmartTv();
	System.out.println(samsung.ligada);
	System.out.println(samsung.canal);
	System.out.println(samsung.volume);	
		
	samsung.ligarDesligarTv();
	
	System.out.println(samsung.ligada);
	
	samsung.aumentarVolume();
	samsung.aumentarVolume();
	samsung.aumentarVolume();
	
	System.out.println(samsung.volume);
	
	}
	

}
