package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("dominando as coleções do Java", "Paulo Silveira");

		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 2));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		

		Collections.sort(aulas);
	}

}
