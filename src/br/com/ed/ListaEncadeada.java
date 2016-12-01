package br.com.ed;

public class ListaEncadeada<T> {

	private Node<T> primeiro;
	private Node<T> ultimo;
	private int tamanho = 0;

	public void adicionaNoComeco(T elemento) {
		Node<T> novo = new Node<T>(elemento, primeiro);
		primeiro = novo;
		
		if(isVazia()) {
			ultimo = primeiro;
		}		
		
		tamanho++;
	}

	public void adiciona(T elemento) {
		if (isVazia()) {
			adicionaNoComeco(elemento);
		} else {
			Node <T> newNode = new Node<T>(elemento, null);
			ultimo.setProximo(newNode);
			ultimo = newNode;
		}
	}

	public void adiciona(int posicao, T elemento) {
		Node<T> node = getNode(posicao);

	}

	public Node<T> getNode(int posicao) {
		Node<T> noAtual = primeiro;
		for (int i = 0; i < posicao; i++) {
			noAtual = noAtual.getProximo();
		}
		return noAtual;
	}

	public T pega(int posicao) {
		return primeiro.getObjeto();
	}

	public void remove(int posicao) {

	}

	public int tamanho() {
		return tamanho;
	}

	public boolean contem() {
		return false;
	}

	@Override
	public String toString() {

		if (isVazia()) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");

		for (Node<T> x = primeiro; x != null; x = x.getProximo()) {
			builder.append(x.getObjeto());
			builder.append(",");
		}

		builder.append("]");

		return builder.toString();
	}

	private boolean isVazia() {
		return tamanho == 0;
	}
}
