package br.com.ed;

import java.util.Arrays;

import br.com.ed.model.Aluno;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];

	public void adicionar(Aluno aluno) {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}
	}

	public Aluno pegar(int posicao) {
		return alunos[posicao];
	}

	public void remove(int posicao) {

	}

	public boolean contem() {
		return false;
	}

	public int tamanho() {
		return 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
