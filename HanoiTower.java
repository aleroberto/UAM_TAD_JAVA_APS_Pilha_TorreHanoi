
public class HanoiTower {
	Pilha pinoA;
	Pilha pinoB;
	Pilha pinoC;

	public HanoiTower() {
		pinoA = new Pilha(3);
		pinoB = new Pilha(3);
		pinoC = new Pilha(3);

		pinoA.empilha(3);
		pinoA.empilha(2);
		pinoA.empilha(1);
	}

	public void messageMovement(char pinoOrigem, char pinoDestino) {
		System.out.println("Movendo de " + pinoOrigem + " para " + pinoDestino);
	}

	public void move(char pinoOrigem, char pinoDestino) {

		if (pinoOrigem == 'A' && pinoDestino == 'B') {
			this.messageMovement(pinoOrigem, pinoDestino);

			if (!pinoA.pilhaVazia() && pinoB.topo < pinoA.topo) {
				pinoB.empilha(pinoA.desempilha());
			}

		} else if (pinoOrigem == 'A' && pinoDestino == 'C') {
			this.messageMovement(pinoOrigem, pinoDestino);

			if (!pinoA.pilhaVazia() && pinoC.topo < pinoA.topo) {
				pinoC.empilha(pinoA.desempilha());
			}
		}
	}

	public void print() {
		for (int i = 2; i >= 0; i--) {
			System.out.println(pinoA.vetor[i] + " | " + pinoB.vetor[i] + " | " + pinoC.vetor[i]);
		}
		System.out.println("A | B | C");
		System.out.println("   ");
	}
}
