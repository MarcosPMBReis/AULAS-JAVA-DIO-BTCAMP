package Ifs_Logica;

import java.util.Scanner;

public class LogicaIFs {
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		float ValorSalario = entradas.nextFloat();
		float ValorBeneficios = entradas.nextFloat();
		float ValorImpostos;

		if (ValorSalario >= 0 && ValorSalario <= 1400) {
			ValorImpostos = 0.05F * ValorSalario;
		} else if (ValorSalario > 1400 && ValorSalario <= 2500) {
			ValorImpostos = 0.1F * ValorSalario;
		} else {
			ValorImpostos = 0.15F * ValorSalario;
		}
		float salarioLiquido = (ValorSalario - ValorImpostos + ValorBeneficios);
		System.out.println(String.format("O valor do salário líquido será: %.2f", salarioLiquido));
	}
}
