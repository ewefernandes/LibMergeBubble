package controller;

import ewelin.merge.bubble.sort.Merge;

public class Ordenacoes {
	
	public Ordenacoes() {
		super();
	}
	
	public int[] LibOrdenacoes(int[] vetor, int inicio, int fim) {
		Merge ordenacao = new Merge();
		vetor = ordenacao.mergeSort(vetor, inicio, fim);
		return vetor;
	}
}
