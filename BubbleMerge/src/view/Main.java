package view;
import controller.Ordenacoes;
import ewelin.merge.bubble.sort.Merge;

public class Main {
	
	public static void main(String[] args) {
		
		Ordenacoes op = new Ordenacoes();
		int [] vetor = {31,32,33,34,99,98,97,96};
		
		vetor = op.LibOrdenacoes(vetor, 0, vetor.length-1);
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
		}
	}

}
