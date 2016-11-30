package br.com.ed;

import java.util.Arrays;

import br.com.ed.model.Aluno;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void adicionar(Aluno aluno) {
		alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}

	public void adicionar(int posicao, Aluno aluno) {
		if (posicao >= 0 && posicao <= totalDeAlunos) {
			for (int i = totalDeAlunos - 1; i >= posicao; i--) {
				alunos[i + 1] = alunos[i];
			}
			alunos[posicao] = aluno;
			totalDeAlunos++;
		} else {
			throw new IllegalArgumentException("Posição invalida.");
		}
	}

	public Aluno pegar(int posicao) {
		validarPosicao(posicao);
		return alunos[posicao];
	}

	public void remove(int posicao) {

		validarPosicao(posicao);
		for (int i = posicao; i < totalDeAlunos; i++) {
			alunos[i] = alunos[i + 1];
		}
		totalDeAlunos--;
	}

	private void validarPosicao(int posicao) {
		if (!isPosicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição invalida.");
		}
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {
			if (alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return totalDeAlunos;
	}

	boolean isPosicaoValida(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
