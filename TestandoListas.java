package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "conhecendo mais de listas";
		String aula2 = "modelando a classe Aula";
		String aula3 = "trabalhando com cursos sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);
		System.out.println(aulas);

		for (String aula : aulas) {

			System.out.println("Aula: " + aula);

		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula e: " + primeiraAula);

		for (int i = 0; i > aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}
		aulas.forEach(aula -> {
			System.out.println("Percorrendo: " + aula);
			System.out.println("Aula " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		Collections.sort(aulas);
		System.out.println("Depois de ordenado" + aulas);
	}
}