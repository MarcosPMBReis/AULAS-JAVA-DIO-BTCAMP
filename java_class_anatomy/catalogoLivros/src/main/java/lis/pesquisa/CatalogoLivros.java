package main.java.lis.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	//Atributos
	
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));	
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<Livro>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}

	public List<Livro> PesquisarPorIntervaloAno(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloano = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloano.add(l);
				}
			}
		}
		return livrosPorIntervaloano;
	}

	public Livro pesquisarPorTitulo(String titutlo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titutlo)) {
					livroPorTitulo = l;
				}
			}
		}
		return livroPorTitulo;
	}

	
	
	public static void main(String[] args) {
		CatalogoLivros catalogolivros = new CatalogoLivros();
		catalogolivros.adicionarLivro("Titulo1", "Autor1", 2022);
		catalogolivros.adicionarLivro("Titulo1", "Autor2", 2021);
		catalogolivros.adicionarLivro("Titulo3", "Autor2", 2020);
		catalogolivros.adicionarLivro("Titulo4", "Autor3", 2019);
		catalogolivros.adicionarLivro("Titulo5", "Autor4", 2018);
		catalogolivros.adicionarLivro("Titulo6", "Autor4", 2017);
		
		System.out.println(catalogolivros.pesquisarPorAutor("Autor2"));
		System.out.println(catalogolivros.PesquisarPorIntervaloAno(2020, 2022));
		System.out.println(catalogolivros.pesquisarPorTitulo("Titulo1"));
		
		
		
	}
}
