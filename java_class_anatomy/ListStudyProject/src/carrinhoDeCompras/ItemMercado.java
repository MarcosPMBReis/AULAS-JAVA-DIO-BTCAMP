package carrinhoDeCompras;

public class ItemMercado {
	private String nome;
	private double preco;
	private int codBarras;
	

	public ItemMercado(String nome, double preco, int codBarras) {
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

}
