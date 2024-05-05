package Operadores_java;

public class operadores_java {
	public static void main(String[] args) {
		
		//Simbolos especiais que detem determinadas funções
		
		//Operador de atribuição (=) atribui, ou subscreve o valor de uma variavel
		
		String nome = "marcos";
		int idade = 25;
		double peso = 65.3;
		boolean doadorOrgao = false;
		
		//Operadores aritméticos são usados para realizar operações matemáticas + - * /
		double soma = 10.5 + 15.7;
		int subtração = 7-3;
		int multiplicação = 20*7;
		int divisão = 15/3;
		int modulo = 18%3;
				
		System.out.println(modulo);
		
		System.out.println();
		
		
		boolean abc = false;
		
		abc = !abc;
		
		System.out.println(abc);
		
		// Operador ternário: simplifica uma condição de if else
		int a , b;
		a = 6;
		b = 3;
		
//		String resultado = "";
//		
//		if (a == b)
//			resultado = "Verdadeiro";
//		else
//			resultado = "Falso";
		String resultado = a == b ? "Verdadeiro" : "Falso";
		
		//Pode-se substituir o Verdadeiro e falso por 1 : 0 respectivamente
		
		System.out.println(resultado);
		
		//Operadores relacionais, Define-se o operando a esquerda comparado com o operando da direita
		// == Igualdade
		// != Diferença
		// < Menor
		// > maior
		// <= menor igual
		// >= maior igual
		
		// Operadores Lógicos
		// && operador E
		// || operador OU
		
		boolean test = true;
		int a1 = 3;
		int b2 = 2;
		
		if (a1 > b2 && a1 * b >= 4)
			test = false;
		
		System.out.println(test);
	}
}
