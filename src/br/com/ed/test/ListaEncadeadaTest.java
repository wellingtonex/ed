package br.com.ed.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.ed.ListaEncadeada;
import br.com.ed.model.Aluno;
 

public class ListaEncadeadaTest {

	@Test
	public void testaListaEncadeada() {
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		alunos.adicionaNoComeco(aluno0);
		alunos.adicionaNoComeco(aluno1);
		alunos.adicionaNoComeco(aluno2);
		
		System.out.println(alunos);
		assertEquals(3, alunos.tamanho());
		//Assert.assertEquals(aluno0, alunos.pega(0));
	}
	
	@Test
	public void testaGetNodeListaEncadeada() {
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		alunos.adicionaNoComeco(aluno0);
		alunos.adicionaNoComeco(aluno1);
		alunos.adicionaNoComeco(aluno2);
		
		System.out.println(alunos);
		assertEquals(aluno2, alunos.getNode(0).getObjeto());
		assertEquals(aluno1, alunos.getNode(1).getObjeto());
		assertEquals(aluno0, alunos.getNode(2).getObjeto());
		//Assert.assertEquals(aluno0, alunos.pega(0));
	}
	
	@Test
	public void testaAdicionarElementoNoFinalDaListaEncadeada() {
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		
		System.out.println(alunos);
		assertEquals(aluno0, alunos.getNode(0).getObjeto());
		assertEquals(aluno1, alunos.getNode(1).getObjeto());
		assertEquals(aluno2, alunos.getNode(2).getObjeto());
		//Assert.assertEquals(aluno0, alunos.pega(0));
	}
	
	@Test
	public void testaAdicionarElementoEmUmaDeterminadaPosicaoDaListaEncadeada() {
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		Aluno aluno3 = new Aluno("Aluno3");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		
		System.out.println(alunos);
		
		alunos.adiciona(1, aluno3);
		
		System.out.println(alunos);
		
		assertEquals(aluno3, alunos.getNode(1).getObjeto());
		assertEquals(4, alunos.tamanho());
	}
	
	@Test
	public void testaRemoverElementoEmUmaDeterminadaPosicaoDaListaEncadeada() {
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		Aluno aluno3 = new Aluno("Aluno3");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		alunos.adiciona(aluno3);
		
		System.out.println(alunos);
		
		alunos.remove(1);
		
		System.out.println(alunos);
		
		assertEquals(3, alunos.tamanho());
		assertEquals(aluno2, alunos.getNode(1).getObjeto());		
	}
	
	@Test
	public void testaRemoverElementoNaPrimeiraPosicaoDaListaEncadeada() {
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		Aluno aluno3 = new Aluno("Aluno3");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		alunos.adiciona(aluno3);
		
		System.out.println(alunos);
		
		alunos.remove(0);
		
		System.out.println(alunos);
		
		assertEquals(3, alunos.tamanho());		
		assertEquals(aluno1, alunos.getNode(0).getObjeto());		
	}
	
	@Test
	public void testaRemoverElementoNaUltimaPosicaoDaListaEncadeada() {
		ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
		
		Aluno aluno0 = new Aluno("Aluno0");
		Aluno aluno1 = new Aluno("Aluno1");
		Aluno aluno2 = new Aluno("Aluno2");
		Aluno aluno3 = new Aluno("Aluno3");
		
		alunos.adiciona(aluno0);
		alunos.adiciona(aluno1);
		alunos.adiciona(aluno2);
		alunos.adiciona(aluno3);
		
		System.out.println(alunos);
		
		alunos.remove(3);
		
		System.out.println(alunos);
		
		assertEquals(3, alunos.tamanho());
		assertEquals(aluno2, alunos.getNode(alunos.tamanho() - 1).getObjeto());		
	}
}
