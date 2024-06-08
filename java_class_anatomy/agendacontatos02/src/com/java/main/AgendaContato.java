package com.java.main;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
	//atributos
	
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContato () {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato (String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato (String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}	
	
	public static void main(String[] args) {
		AgendaContato agendaContato = new AgendaContato();
		
		agendaContato.adicionarContato("Lucas", 98989898);
		agendaContato.adicionarContato("João", 67676767);
		agendaContato.adicionarContato("Marcos", 34343434);
		agendaContato.adicionarContato("Paulo", 56565656);

		agendaContato.exibirContatos();
		
		agendaContato.removerContato("Lucas");

		agendaContato.exibirContatos();
	
		System.out.println(agendaContato.pesquisarPorNome("Paulo"));
	
	}
}
