package br.com.ed.test;

import static org.junit.Assert.*;
import org.junit.Test;

import br.com.ed.Pilha;

public class PilhaTest {

	@Test
	public void pushTest() {
		Pilha<String> pilha = new Pilha<>();
		
		pilha.push("0");
		pilha.push("1");
		
		
		assertEquals(2, pilha.size());
		assertEquals("1",pilha.peek());
		assertEquals(2, pilha.size());
		assertEquals("1", pilha.pop());
		assertEquals("0", pilha.pop());
		assertTrue(pilha.isEmpty());
		
	}
}
