package br.com.ed;

import java.util.Arrays;

import br.com.ed.model.Aluno;

public class Vetor<T> {

	private Object[] elementos;
	private int tamanho = 0;
	
	public Vetor(int tamanhoInicial) {
		elementos = new Object[tamanhoInicial];
	}
	
	public Vetor() {
		elementos = new Object[10];
	}

	public void adicionar(T elemento) {
		garanteEspaco();
		elementos[tamanho] = elemento;
		tamanho++;
	}

	public void adicionar(int posicao, T elemento) {
		if (posicao >= 0 && posicao <= tamanho) {
			garanteEspaco();
			for (int i = tamanho - 1; i >= posicao; i--) {
				elementos[i + 1] = elementos[i];
			}
			elementos[posicao] = elemento;
			tamanho++;
		} else {
			throw new IllegalArgumentException("Posição invalida.");
		}
	}

	@SuppressWarnings("unchecked")
	public T pegar(int posicao) {
		validarPosicao(posicao);
		return (T) elementos[posicao];
	}

	public void remove(int posicao) {
		validarPosicao(posicao);
		for (int i = posicao; i < tamanho; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho--;
	}

	private void validarPosicao(int posicao) {
		if (!isPosicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição invalida.");
		}
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}
	
	private void garanteEspaco() {
		if(tamanho == elementos.length) {
			Object[] novoArray = new Object[tamanho * 2];
			
			for (int i = 0; i < elementos.length; i++) {
				novoArray[i] = elementos[i];
			}
			elementos = novoArray;
		}
	}

	public int tamanho() {
		return tamanho;
	}

	boolean isPosicaoValida(int posicao) {
		return posicao >= 0 && posicao < tamanho;
	}

	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}
}
