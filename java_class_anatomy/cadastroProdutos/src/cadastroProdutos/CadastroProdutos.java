package cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	// atributos

	private Set<Produto> produtoList;

	public CadastroProdutos() {
		this.produtoList = new HashSet<>();
	}

	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoList.add(new Produto(codigo, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutoPorNome() {
		Set<Produto> ordenarPorNome = new TreeSet<>(produtoList);
		return ordenarPorNome;
	}

	public Set<Produto> exibirProdutoPorPreco() {
		Set<Produto> ordenarPorPreco = new TreeSet<>(new ComparatorPorPreco());
		ordenarPorPreco.addAll(produtoList);
		return ordenarPorPreco;
	}

	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		cadastroProdutos.adicionarProduto(1L, "Produto 01", 14d, 5);
		cadastroProdutos.adicionarProduto(2L, "Produto 03", 20d, 10);
		// cadastroProdutos.adicionarProduto(1L, "Produto 05", 10d, 2);
		cadastroProdutos.adicionarProduto(0L, "Produto 08", 2d, 2);

		System.out.println(cadastroProdutos.produtoList);

		System.out.println(cadastroProdutos.exibirProdutoPorNome());

		System.out.println(cadastroProdutos.exibirProdutoPorPreco());

	}
}
