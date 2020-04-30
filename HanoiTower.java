
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

	public boolean checks(char pinoOrigem, char destino) {
		Pilha checkOrigem = new Pilha(3);
		int checkDestino = -1;
		switch (pinoOrigem) {
			case 'A':
				checkOrigem = pinoA;
				break;
			case 'B':
				checkOrigem = pinoB;
				break;
			case 'C':
				checkOrigem = pinoC;
				break;
		}
		switch (destino) {
			case 'A':
				checkDestino = pinoA.vetor[pinoA.topo == -1 ? 0 : pinoA.topo];
				break;
			case 'B':
				checkDestino = pinoB.vetor[pinoB.topo  == -1 ? 0 : pinoB.topo];
				break;
			case 'C':
				checkDestino = pinoC.vetor[pinoC.topo  == -1 ? 0 : pinoC.topo];
			default:
				break;
		}
		return (checkOrigem.pilhaVazia() || (checkOrigem.vetor[checkOrigem.topo] > checkDestino && checkDestino != 0));
	}

	public void move(char pinoOrigem, char pinoDestino) {

		if (checks(pinoOrigem, pinoDestino)) {
			System.out.println("Nao foi possível mover " + pinoOrigem + " para " + pinoDestino + ", verifique os pinos");
		} else {

			System.out.println("Movendo de " + pinoOrigem + " para " + pinoDestino + "\n");

			if (pinoOrigem == 'A') {
				switch (pinoDestino) {
					case 'B':
						pinoB.empilha(pinoA.desempilha());
						break;
					case 'C':
						pinoC.empilha(pinoA.desempilha());
						break;
				}
				pinoA.vetor[pinoA.topo + 1] = 0;
			}

			else if (pinoOrigem == 'B') {
				switch (pinoDestino) {
					case 'A':
						pinoA.empilha(pinoB.desempilha());
						break;
					case 'C':
						pinoC.empilha(pinoB.desempilha());
					default:
						break;
				}
				pinoB.vetor[pinoB.topo + 1] = 0;
			}

			else if (pinoOrigem == 'C') {
				
				switch (pinoDestino) {
					case 'A':
						pinoA.empilha(pinoC.desempilha());
						break;
					case 'B':
						pinoB.empilha(pinoC.desempilha());
					default:
						break;
				}
				pinoC.vetor[pinoC.topo + 1] = 0;
			}
		}
	}

	public void print() {
		for (int i = 2; i >= 0; i--) {
			System.out.println((pinoA.vetor[i] == 0 ? '-' : Integer.toString(pinoA.vetor[i])) + " | "
					+ (pinoB.vetor[i] == 0 ? '-' : Integer.toString(pinoB.vetor[i])) + " | "
					+ (pinoC.vetor[i] == 0 ? '-' : Integer.toString(pinoC.vetor[i])));
		}
		System.out.println("A | B | C\n");
	}
}
