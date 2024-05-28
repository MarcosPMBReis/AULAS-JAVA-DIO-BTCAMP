package listProject;

public class Tarefa {
	//Atributo
	private String descricao;
	
	//getters e setters
	public Tarefa(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	//Constructor
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
