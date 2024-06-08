package main.java.agendaEventos;

public class Evento {
	// Atributos
	
	private String nome;
	private String atracao;
	public Evento(String nome, String atracao) {
		super();
		this.nome = nome;
		this.atracao = atracao;
	}
	@Override
	
	
	public String toString() {
		return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
	}
	/**
	 * @return the nome
	 */
	
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the atracao
	 */
	public String getAtracao() {
		return atracao;
	}
	/**
	 * @param atracao the atracao to set
	 */
	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}

	
}
