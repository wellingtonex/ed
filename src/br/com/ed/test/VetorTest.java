package br.com.ed.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.ed.Vetor;
import br.com.ed.model.Aluno;

public class VetorTest {

	@Test
	public void testaVetor() {
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Jose");
		Aluno aluno3 = new Aluno("Pedro");
		
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		vetor.adicionar(aluno1);
		vetor.adicionar(aluno2);
		
		assertEquals(vetor.pegar(0), aluno1);
		assertEquals(vetor.pegar(1), aluno2);
		assertTrue(vetor.contem(aluno2));
		assertTrue(vetor.contem(aluno1));
		assertFalse(vetor.contem(aluno3));
		
	}
	
	@Test
	public void testaCriaVetorComUmaPosicaoEAdicionaVariosElementos() {
		Aluno aluno0 = new Aluno("Joao");
		Aluno aluno1 = new Aluno("Jose");
		Aluno aluno2 = new Aluno("Pedro");
		Aluno aluno3 = new Aluno("Amanda");
		Aluno aluno4 = new Aluno("Leticia");
		
		Vetor<Aluno> vetor = new Vetor<Aluno>(1);
		System.out.println(vetor);
		
		vetor.adicionar(aluno0);
		System.out.println(vetor);
		
		
		vetor.adicionar(aluno1);
		vetor.adicionar(aluno2);
		vetor.adicionar(aluno3);
		System.out.println(vetor);
		vetor.adicionar(aluno4);
		System.out.println(vetor);		
		
		assertEquals(vetor.tamanho(), 5);
		
		
	}
	
	@Test
	public void testaAdicionarElementoEmDeterminadaPosicaoDoVetor() {
		Aluno joao = new Aluno("Joao");
		Aluno jose = new Aluno("Jose");
		Aluno pedro = new Aluno("Pedro");
		
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		vetor.adicionar(0, joao);
		vetor.adicionar(1, jose);
		vetor.adicionar(2, pedro);
		
		
		
		Aluno amanda = new Aluno("Amanda");
		vetor.adicionar(1, amanda);		
		assertEquals(vetor.pegar(0), joao);
		assertEquals(vetor.pegar(1), amanda);
		assertEquals(vetor.pegar(2), jose);
		assertEquals(vetor.pegar(3), pedro);
		assertEquals(vetor.tamanho(), 4);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaAdicionarElementoEmDeterminadaPosicaoInvalidaDoVetor() {
		Aluno joao = new Aluno("Joao");
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		vetor .adicionar(1, joao);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaPegarAlunoPosicaoInvalidaVetor() {
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Jose");
		Aluno aluno3 = new Aluno("Pedro");
		
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		vetor.adicionar(aluno1);
		vetor.adicionar(aluno2);
		vetor.adicionar(aluno3);
		
		vetor.pegar(4);
		
	}
	
	@Test
	public void testaRemoverItemEmDeterminadaPosicaoDoVetor() {
		Aluno aluno0 = new Aluno("Joao");
		Aluno aluno1 = new Aluno("Jose");
		Aluno aluno2 = new Aluno("Pedro");
		Aluno aluno3 = new Aluno("Guilherme");
		
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		vetor.adicionar(aluno0);
		vetor.adicionar(aluno1);
		vetor.adicionar(aluno2);
		vetor.adicionar(aluno3);
		assertEquals(vetor.tamanho(), 4);
		System.out.println(vetor);
		vetor.remove(1);
		
		assertEquals(vetor.tamanho(), 3);
		assertEquals(vetor.pegar(0), aluno0);
		assertEquals(vetor.pegar(1), aluno2);
		assertEquals(vetor.pegar(2), aluno3);
		System.out.println(vetor);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaRemoverItemEmPosicaoQueExcedeTamanhaDoVetor() {
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Jose");
		Aluno aluno3 = new Aluno("Pedro");
		
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		vetor.adicionar(aluno1);
		vetor.adicionar(aluno2);
		vetor.adicionar(aluno3);
		
		vetor.remove(10);
		assertEquals(vetor.tamanho(), 2);
	}
}
