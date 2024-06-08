package main.java.estoqueProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
	// Atributos
	
	private Map<Long, Produto> estoquesProdutosMap;
	
	public EstoqueProduto() {
		this.estoquesProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long i, String nome, int quantidade, double preco) {
		estoquesProdutosMap.put(i, new Produto(nome, preco, quantidade) );
	}
	
	public void exibirTodosProdutos() {
		System.out.println(estoquesProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if(!estoquesProdutosMap.isEmpty()) {
			for(Produto p : estoquesProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade()*p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro () {
		Produto produtoMaisCaro = null;
		double precoMaisCaro = Double.MIN_VALUE;
		if(!estoquesProdutosMap.isEmpty()) {
			for(Produto p : estoquesProdutosMap.values()) {
				if(p.getPreco() > precoMaisCaro ) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	
	public static void main(String[] args) {
		
		EstoqueProduto estoqueA = new EstoqueProduto();
		
		estoqueA.exibirTodosProdutos();
		
		estoqueA.adicionarProduto(2233, "Pera", 3, 10.00);
		estoqueA.adicionarProduto(1122, "Maça", 1, 3.85);
		estoqueA.adicionarProduto(3344, "Banana", 4, 8.60);
		
		estoqueA.exibirTodosProdutos();
		System.out.println(estoqueA.calcularValorTotalEstoque());
		System.out.println(estoqueA.obterProdutoMaisCaro());
		
		
	}
	
}
