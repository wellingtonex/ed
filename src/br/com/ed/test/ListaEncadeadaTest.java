package br.com.ed.test;

import java.util.LinkedList;
import java.util.List;

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
	
	public void teste() {
		List<String> listaEncadeada = new LinkedList<String>();
		listaEncadeada.add("a");
	}
}
