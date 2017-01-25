package br.com.ed.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.ed.Fila;

public class FilaTest {

	@Test
	public void pushTest() {
		Fila<String> fila = new Fila<>();
		
		fila.add("0");
		fila.add("1");
		
		
		assertEquals(2, fila.size());
		assertEquals("0",fila.peek());
		assertEquals(2, fila.size());
		assertEquals("0", fila.pull());
		assertEquals("1", fila.pull());
		assertTrue(fila.isEmpty());
		
	}
}
