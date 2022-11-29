package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("dominando as coleções do Java", "Paulo Silveira");

		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 2));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
 
		System.out.println("todos os alunos matriculados nesse curso: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		System.out.println("O aluno" + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("e esse turini? esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("o a1 e equals ao turini?");
		System.out.println(a1.equals(turini));

	}

}
