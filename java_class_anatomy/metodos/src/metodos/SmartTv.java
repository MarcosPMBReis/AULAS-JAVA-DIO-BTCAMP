package metodos;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 1;
	
	void ligarDesligarTv () {
		ligada = !ligada;
	}
	
	void aumentarVolume () {
		volume++;
	}
	
	void diminuirVolume () {
		volume--;
	}
}
