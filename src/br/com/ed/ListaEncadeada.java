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
			tamanho++;
		}
	}
	
	private boolean isPosisaoValida(int posicao) {
		return posicao >=0 && posicao < tamanho; 
	}
	
	private void validaPosicao(int posicao) {
		if(!isPosisaoValida(posicao)) {
			throw new IllegalArgumentException("Posição invalida.");
		}
	}

	public void adiciona(int posicao, T elemento) {
		validaPosicao(posicao);
		
		Node<T> anterior = getNode(posicao -1);		
		Node<T> newNode = new Node<T>(elemento, anterior.getProximo());
		anterior.setProximo(newNode);
		tamanho++;
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
		validaPosicao(posicao);
		if(posicao == 0) {
			primeiro = primeiro.getProximo();
		} else {
			Node<T> anterior = getNode(posicao - 1);
			Node<T> corrente = getNode(posicao);
			
			anterior.setProximo(corrente.getProximo());
			corrente = null;
			
			if(posicao == (tamanho -1)) {
				ultimo = anterior;
			}
		}
		
		
		
		tamanho--;
		
		if(tamanho == 0) {
			ultimo = null;
		}
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
