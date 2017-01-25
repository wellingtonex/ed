package br.com.ed;

import java.util.LinkedList;

public class Pilha<T> {
	
	private LinkedList<T> objects = new LinkedList<>();

    public void push(T object) {
    	objects.addFirst(object);
    }

    public T pop() {
    	return objects.removeFirst();         
    }

    public boolean isEmpty() {
        return objects.isEmpty();
    }

	public int size() {		
		return objects.size();
	}

	public T peek() {
		return  objects.getFirst();
	}
}
