package br.com.ed;

public class Node<T> {

	private T objeto;
	private Node<T> proximo;
	
	public Node(T objeto, Node<T> proximo) {
		this.objeto = objeto;
		this.proximo = proximo;
	}

	public T getObjeto() {
		return objeto;
	}

	public Node<T> getProximo() {
		return proximo;
	}

	public void setProximo(Node<T> proximo) {
		this.proximo = proximo;
	}
	
	
}
