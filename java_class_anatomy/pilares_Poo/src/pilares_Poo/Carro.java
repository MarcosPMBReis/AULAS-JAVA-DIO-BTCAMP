package pilares_Poo;

public class Carro extends Veiculo {
	
	public void Ligar() {		
		ConferindoCambio();
		ConferindoCombustivel();
		System.out.println("Carro ligado");
	}
	
	public void ConferindoCombustivel() {
		System.out.println("Conferindo Combustivel");
	}
	
	public void ConferindoCambio() {
		System.out.println("Conferindo Cambio em parking");
	}
	
}
