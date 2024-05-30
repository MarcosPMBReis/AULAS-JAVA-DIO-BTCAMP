package conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadosList;
	
	
	public ConjuntoConvidados() {
		this.convidadosList = new HashSet<>();
	}
	
	public void AdicionarConvidadoSet(String nome, int codConvite) {
		convidadosList.add(new Convidado(nome, codConvite));
		
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadosList) {
			if (c.getCodigoConvidado() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadosList.remove(convidadoParaRemover);
	}
	
	
	public int contarConvidados() {
		return convidadosList.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadosList);
	}
	
	public static void main(String[] args) {
	ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
	System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
	
	conjuntoConvidados.AdicionarConvidadoSet("Convidado 01", 1214);
	conjuntoConvidados.AdicionarConvidadoSet("Convidado 02", 1213);
	conjuntoConvidados.AdicionarConvidadoSet("Convidado 03", 1212);
	conjuntoConvidados.AdicionarConvidadoSet("Convidado 04", 1211);
	
	conjuntoConvidados.removerConvidadoPorCodigoConvite(1214);
	
	System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");
	
	conjuntoConvidados.exibirConvidados();
	}

		
}
