package br.com.ed.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.ed.ListaDuplamenteEncadeada;
import br.com.ed.model.Aluno;

public class ListaDuplamenteEncadeadaTest {

	@Test
	public void adicionaUmElementoTest() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();

		Aluno aluno0 = new Aluno("Aluno0");

		alunos.adiciona(aluno0);

		assertEquals(aluno0, alunos.getNode(0).getObjeto());
		assertEquals(null, alunos.getNode(0).getAnterior());
		assertEquals(null, alunos.getNode(0).getProximo());
	}

	@Test
	public void adicionaNoInicioTest() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();

		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");

		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);

		assertEquals(aluno0, alunos.getNode(0).getObjeto());
		assertEquals(aluno1, alunos.getNode(1).getObjeto());

		assertEquals(aluno1, alunos.getNode(0).getProximo().getObjeto());
		assertEquals(null, alunos.getNode(0).getAnterior());

		assertEquals(aluno0, alunos.getNode(1).getAnterior().getObjeto());
		assertEquals(null, alunos.getNode(1).getProximo());
	}

	@Test
	public void adicionaNoMeioTest() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();

		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno alunoX = new Aluno("AlunoX");

		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(1, alunoX);

		assertEquals(alunoX, alunos.getNode(1).getObjeto());
		assertEquals(3, alunos.tamanho());

		assertEquals(alunoX, alunos.getNode(0).getProximo().getObjeto());
		assertEquals(aluno0, alunos.getNode(1).getAnterior().getObjeto());

		assertEquals(alunoX, alunos.getNode(2).getAnterior().getObjeto());
		assertEquals(null, alunos.getNode(2).getProximo());
	}

	public void removeComUmElemento() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();

		Aluno aluno0 = new Aluno("Aluno0");

		alunos.adiciona(aluno0);
		alunos.remove(0);

		assertEquals(0,alunos.tamanho());
	}
	
	@Test
	public void removeInicioComTresElementos() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();

		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("AlunoX");

		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		
		alunos.remove(0);

		assertEquals(aluno1, alunos.getNode(0).getObjeto());
		assertEquals(null, alunos.getNode(0).getAnterior());
		assertEquals(2, alunos.tamanho());

	}
	
	@Test
	public void removeFimComTresElementos() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno3 = new Aluno("Aluno3");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno3);
		
		alunos.remove(2);
		
		assertEquals(aluno1, alunos.getNode(1).getObjeto());
		assertEquals(null, alunos.getNode(1).getProximo());
		assertEquals(2, alunos.tamanho());
		
	}
	
	@Test
	public void removeMeioComCincoElementos() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		Aluno aluno3 = new Aluno("Aluno3");
		Aluno aluno4 = new Aluno("Aluno4");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		alunos.adiciona(aluno3);
		alunos.adiciona(aluno4);
		
		alunos.remove(2);
		
		assertEquals(aluno3, alunos.getNode(2).getObjeto());
		assertEquals(aluno4, alunos.getNode(2).getProximo().getObjeto());
		
		assertEquals(aluno1, alunos.getNode(2).getAnterior().getObjeto());
		assertEquals(4, alunos.tamanho());
		
	}
	
	@Test
	public void constainsTest() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		
		assertTrue(alunos.contains(aluno1));
	}
	
	@Test
	public void constainsFalseTest() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		
		alunos.adiciona(aluno0);
		
		
		assertFalse(alunos.contains(aluno1));
	}
	
	@Test
	public void removeElementoMeioComCincoElementos() {
		ListaDuplamenteEncadeada<Aluno> alunos = new ListaDuplamenteEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		Aluno aluno3 = new Aluno("Aluno3");
		Aluno aluno4 = new Aluno("Aluno4");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		alunos.adiciona(aluno3);
		alunos.adiciona(aluno4);
		
		alunos.remove(aluno2);
		
		assertEquals(aluno3, alunos.getNode(2).getObjeto());
		assertEquals(aluno4, alunos.getNode(2).getProximo().getObjeto());
		
		assertEquals(aluno1, alunos.getNode(2).getAnterior().getObjeto());
		assertEquals(4, alunos.tamanho());
		
	}

}
