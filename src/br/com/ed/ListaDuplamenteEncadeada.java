package br.com.ed;

public class ListaDuplamenteEncadeada<T> {

	private Node<T> primeiro;
	private Node<T> ultimo;
	private int tamanho = 0;

	public void adicionaNoComeco(T elemento) {

		if (this.tamanho == 0) {
			Node<T> nova = new Node<T>(elemento);
			this.primeiro = nova;
			this.ultimo = nova;
		} else {
			Node<T> nova = new Node<T>(elemento, this.primeiro);
			this.primeiro = nova;
		}
		this.tamanho++;
	}

	public void adiciona(T elemento) {
		if (isVazia()) {
			adicionaNoComeco(elemento);
		} else {
			Node<T> nova = new Node<>(elemento);
			ultimo.setProximo(nova);
			nova.setAnterior(this.ultimo);
			this.ultimo = nova;
			this.tamanho++;
		}
	}

	private boolean isPosisaoValida(int posicao) {
		return posicao >= 0 && posicao < tamanho;
	}

	private void validaPosicao(int posicao) {
		if (!isPosisaoValida(posicao)) {
			throw new IllegalArgumentException("Posição invalida.");
		}
	}

	public void adiciona(int posicao, T elemento) {
		validaPosicao(posicao);

		Node<T> anterior = getNode(posicao - 1);
		Node<T> proxima = anterior.getProximo();

		Node<T> newNode = new Node<T>(elemento, anterior.getProximo());
		newNode.setAnterior(anterior);
		anterior.setProximo(newNode);
		proxima.setAnterior(newNode);

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

	public void remove(int posicao) {
		validaPosicao(posicao);
		if (posicao == 0) {
			removeDoComeco();
		} else if (posicao == (tamanho - 1)) {
			removeDoFim();
		} else {
			Node<T> anterior = getNode(posicao - 1);
			Node<T> corrente = getNode(posicao);
			Node<T> proximo = corrente.getProximo();

			anterior.setProximo(corrente.getProximo());
			proximo.setAnterior(anterior);
			tamanho--;
			
			if (tamanho == 0) {
				ultimo = null;
			}
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

	private void removeDoFim() {
		if (tamanho > 0) {
			if (this.tamanho == 1) {
				this.removeDoComeco();
			} else {
				ultimo = ultimo.getAnterior();
				ultimo.setProximo(null);
				tamanho--;
			}
		}

		if (tamanho == 0) {
			primeiro = null;
		}
	}

	private void removeDoComeco() {
		if (tamanho > 0) {
			primeiro = primeiro.getProximo();
			primeiro.setAnterior(null);
			tamanho--;
		}

		if (tamanho == 0) {
			ultimo = null;
		}
	}
	
	public boolean contains(T element) {
		if(tamanho == 0) return false;
		
		for (int i = 0; i < tamanho; i++) {
			if(getNode(i).getObjeto().equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	public int getPosition(T element) {
		for (int i = 0; i < tamanho; i++) {
			if(getNode(i).getObjeto().equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(T element) {
		int position = getPosition(element);
		if(position >= 0) {
			remove(position);
		}
	}
}
