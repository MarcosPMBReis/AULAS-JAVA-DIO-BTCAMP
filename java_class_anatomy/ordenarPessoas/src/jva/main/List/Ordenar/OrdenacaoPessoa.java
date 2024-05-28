package jva.main.List.Ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome,idade,altura));
	}
	
	public List<Pessoa> ordenadoPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>();
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>();
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("Lucas", 10, 1.45);
		ordenacaoPessoa.adicionarPessoa("Whai", 20, 1.66);
		ordenacaoPessoa.adicionarPessoa("Jokenilson", 30, 1.65);
		ordenacaoPessoa.adicionarPessoa("Dorielber", 40, 1.98);
		
		System.out.println(ordenacaoPessoa.ordenadoPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
}
