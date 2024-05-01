package Variaveis_Java;

public class java_variaveis {
	public static void main(String[] args) {
		// Tipos de variaveis
		// byte (-128 até 127)
		byte a = 1;

		// Short (-32768 até 32767)
		short b = 10000;

		// int (-2147483648 até 2147483647) asdasda
		int numero_celular = 983443300;

		// long (-9.223.372.036.854.775.808 até 9.223.372.036.854.775.807)
		long abd = 1;

		// float (-3,4028E + 38 até 3,4028E + 38)
		float abc = 1123123123F;
		// Tipos float devem encerrar com um F no final

		// double (-1,7976E + 308 até 1,7976E + 308)
		double quadro = 0.1928;

		// Toda variavel deve ter tipo, nome e atribuição ex:
		double nota = 8.0;
		// double - Tipo / nota - nome / 8.0 - atribuição
		
		
		// Casting - Pega um tipo abrangente e tranforma em um tipo especifico correpondente ex:
		int numeroLongo = 1;
		short numeroCurto = (short) numeroLongo;
		// Veja que foi adicionado um (short) na atribuição, isso acontece para que o java se proteja caso você tente colocar um numero que o tipo short não suporte
		
	}
}
