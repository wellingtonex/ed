package br.com.ed;

import java.util.LinkedList;

public class Fila<T> {

	private LinkedList<T> objects = new LinkedList<>();
	
	public void add(T object) {
		objects.addLast(object);
	}
	
	public T pull() {
		return objects.removeFirst();
	}
	
	public T peek() {
		return objects.getFirst();
	}
	
	public int size() {
		return objects.size();
	}
	
	public boolean isEmpty() {
		return objects.isEmpty();
	}
}
