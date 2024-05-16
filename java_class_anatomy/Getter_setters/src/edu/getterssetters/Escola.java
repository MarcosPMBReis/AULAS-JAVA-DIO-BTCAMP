package edu.getterssetters;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setIdade(19);
		felipe.setNome("Felipe Luis");
		
		
		System.out.println("O aluno "+felipe.getNome()+ " Possui "+felipe.getIdade()+" Anos");
	}
}
