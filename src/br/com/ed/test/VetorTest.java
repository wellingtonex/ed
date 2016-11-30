package br.com.ed.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.ed.Vetor;
import br.com.ed.model.Aluno;

public class VetorTest {

	@Test
	public void testaVetor() {
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Jose");
		
		Vetor vetor = new Vetor();
		
		vetor.adicionar(aluno1);
		vetor.adicionar(aluno2);
		
		Assert.assertEquals(vetor.tamanho(), 2);
	}
}
