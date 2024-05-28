package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class CarrinhoDeCompras {
	
	protected double ValorPago;
	protected double troco;
	
	private List<ItemMercado> carrinhoCompras;
	
	public CarrinhoDeCompras() {
		super();
		this.carrinhoCompras = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int codBarras) {
		carrinhoCompras.add(new ItemMercado(nome, preco, codBarras));
	}
	
	public void removerItem(int codBarras) {
		List<ItemMercado> itensRemovidos = new ArrayList<>();
		for(ItemMercado im : carrinhoCompras) {
			if(im.getCodBarras()==codBarras){
				itensRemovidos.add(im);
			}
		}
		carrinhoCompras.removeAll(itensRemovidos);
	}

	public double calcularTotalCarrinho() {
	    double total = 0.0;
	    for (ItemMercado item : carrinhoCompras) {
	        total += item.getPreco();
	    }
	    return total;
	}

	public void receberPagamento() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Como você deseja realizar o pagamento?");
        System.out.println("1 - Em espécie");
        System.out.println("2 - No cartão");
        
        int opcao = scanner.nextInt();
        String pagamentoTipo = null;
        
        if (opcao == 1) {
            // Pagamento em espécie
        	pagamentoTipo = "especie";
            System.out.print("Digite o valor pago em dinheiro: ");
            ValorPago = scanner.nextDouble();
            
            double totalCompra = calcularTotalCarrinho();
            troco = ValorPago - totalCompra;
            
            if (troco >= 0) {
                System.out.println("Troco: R$" + troco);
            } else {
                System.out.println("Valor insuficiente pago.");
            }
            
        } else if (opcao == 2) {
            // Pagamento no cartão
        	pagamentoTipo = "cartao";
            System.out.println("Insira o cartão na maquininha...");
            // Simular aguardar inserção do cartão
            System.out.println("Aguardando processamento...");
            System.out.println("Pagamento realizado com sucesso!");
            
        } else {
            System.out.println("Opção inválida.");
        }
        
        scanner.close();
        
        gerarNotaFiscal(pagamentoTipo);
    }

	public void gerarNotaFiscal(String tipoPagamento) {
        System.out.println("======= Nota Fiscal =======");
        System.out.println("Data: " + new Date()); // Exemplo de obtenção da data atual
        System.out.println("Itens:");
        for (int i = 0; i < carrinhoCompras.size(); i++) {
            ItemMercado item = carrinhoCompras.get(i);
            System.out.println("  " + (i+1) + ". " + item.getNome() + " - R$" + item.getPreco());
        }
        System.out.println("Total da compra: R$" + calcularTotalCarrinho());

        if ("especie".equalsIgnoreCase(tipoPagamento)) {
            if (troco >= 0) {
                System.out.println("Tipo de pagamento: Espécie");
                System.out.println("Valor pago: R$" + ValorPago);
                System.out.println("Troco: R$" + troco);
            } else {
                System.out.println("Valor insuficiente pago.");
            }
        } else if ("cartao".equalsIgnoreCase(tipoPagamento)) {
            // Pagamento no cartão
            System.out.println("Tipo de pagamento: Cartão");
        } else {
            System.out.println("Tipo de pagamento: Indefinido");
        }
        
        System.out.println("===========================");
    }

	
	public static void main(String[] args) {
	CarrinhoDeCompras carrinhoCompras1 = new CarrinhoDeCompras();
	carrinhoCompras1.adicionarItem("Maça", 4.70, 912838);
	carrinhoCompras1.adicionarItem("Pera", 9.50, 912828);
	carrinhoCompras1.adicionarItem("beterraba", 4.56, 913428);
	
	carrinhoCompras1.receberPagamento();
	}
}

