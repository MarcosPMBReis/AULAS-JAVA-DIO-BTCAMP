package main.java.agendaEventos;

import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

public class AgendaEventos {
	//Atributos
	
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome,atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento () {
//		Set<LocalDate> dataSet = eventosMap.keySet();
//		Collection<Evento> values = eventosMap.values();
	
		LocalDate dataAtual = LocalDate.now();
		Evento proximaData = null;
		LocalDate proximoEvento = null;
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getValue();
				proximoEvento = entry.getKey();
				System.out.println("O Proximo evento: " + proximaData + " acontecerá na data: "+ proximoEvento);
				break;
			}
			
		}
		
	
	}
	
	public static void main(String[] args) {
		
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 20), "festa 01", "Xand Avião");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 21), "festa 02", "Nathan");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 22), "festa 03", "Leo");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 23), "festa 04", "GG");
	
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
	
}
