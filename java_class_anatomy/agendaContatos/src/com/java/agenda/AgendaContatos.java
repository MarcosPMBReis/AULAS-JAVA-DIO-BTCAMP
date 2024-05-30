package com.java.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	//Atributos
	
	private Set<Contato> contatoList;
	
	public AgendaContatos() {
		this.contatoList = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoList.add(new Contato(nome,numero));
	}

	public void exibirContato() {
		System.out.println(contatoList);
	}
	
	public Set<Contato> pesquisarContatosPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoList) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int numero) {
		Contato contatoAtualizado = null;
		for (Contato c : contatoList) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.exibirContato();
		
		agendaContatos.adicionarContato("Marcos", 99887766);
		agendaContatos.adicionarContato("Lucas", 11223344);
		agendaContatos.adicionarContato("Pedro", 22334455);
		agendaContatos.adicionarContato("João", 33445566);
		agendaContatos.adicionarContato("Mateus", 44556677);
		
		agendaContatos.exibirContato();
		
		System.out.println(agendaContatos.pesquisarContatosPorNome("Marcos"));
		
		agendaContatos.atualizarNumeroContato("Marcos", 88776655);
		
		System.out.println(agendaContatos.pesquisarContatosPorNome("Marcos"));
		
	}

}
