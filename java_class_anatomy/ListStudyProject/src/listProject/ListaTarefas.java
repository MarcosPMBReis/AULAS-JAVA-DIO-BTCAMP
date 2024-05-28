package listProject;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	// atributo

	private List<Tarefa> tarefalist;

	public ListaTarefas() {
		super();
		this.tarefalist = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefalist.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for (Tarefa t : tarefalist) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}
		tarefalist.removeAll(tarefaParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefalist.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefalist);
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
	
		listaTarefa.adicionarTarefa("Tarefa 01");
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 02");
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
//		listaTarefa.removerTarefa("Tarefa 02");
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}
}
