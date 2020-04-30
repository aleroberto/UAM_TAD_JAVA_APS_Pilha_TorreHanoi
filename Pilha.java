
public class Pilha {
	int[] vetor;
	int topo;

	public Pilha(int tamanhoMaximo) {
		vetor = new int[tamanhoMaximo];
		topo = -1;
	}

	public void empilha(int elemento) {
		topo++;
		vetor[topo] = elemento;

	}

	public int pegaPosicao(int posica) {
		return this.vetor[posica];
	}

	public int desempilha() {
		if (pilhaVazia()) {
			return -1;
		} else {
			int elemento = vetor[topo];
			topo--;
			return elemento;
		}

	}

	boolean pilhaVazia() {
		return (this.topo == -1);
	}

}
