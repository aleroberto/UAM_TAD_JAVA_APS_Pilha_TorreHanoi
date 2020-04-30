
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

	public void melhorMov(Pilha origem, Pilha destino) {

		if (destino.topo < origem.topo) {
			destino.empilha(origem.desempilha());
		} else {
			System.out.println("zuado");
		}

	}

	public void messageMovement(char pinoOrigem, char pinoDestino) {
		System.out.println("Movendo de " + pinoOrigem + " para " + pinoDestino);
	}

	public void move(char pinoOrigem, char pinoDestino) {

		int discoTopo = 0;

		if (pinoOrigem == 'A' && pinoDestino == 'B') {
			this.messageMovement(pinoOrigem, pinoDestino);
			discoTopo = pinoA.desempilha();

			if (discoTopo == -1) {
				System.out.println("Este cara esTa vazio");
			} else {
				if (pinoB.topo < discoTopo) {
					pinoB.empilha(discoTopo);
					System.out.println("Sim deu certo " + pinoB.pegaPosicao(pinoB.topo));
				} else {
					pinoA.empilha(discoTopo);
					System.out.println("Nada feito, disco menor");
				}
			}
		} else if (pinoOrigem == 'A' || pinoDestino == 'C') {
			this.messageMovement(pinoOrigem, pinoDestino);

			discoTopo = pinoA.desempilha();

			if (discoTopo == -1) {
				System.out.println("Este cara esra vazio");
			} else {
				if (pinoC.topo > discoTopo) {
					pinoC.empilha(discoTopo);
					System.out.println("Sim deu certo " + pinoC.pegaPosicao(pinoC.topo));
				} else {
					pinoA.empilha(discoTopo);
					System.out.println("Nada feito, disco menor");
				}
			}
		} else if (pinoOrigem == 'B' || pinoDestino == 'A') {
			this.messageMovement(pinoOrigem, pinoDestino);
			discoTopo = pinoB.desempilha();

			if (discoTopo == -1) {
				System.out.println("Este cara esra vazio");
			} else {
				if (pinoA.topo < discoTopo) {
					pinoA.empilha(discoTopo);
					System.out.println("Sim deu certo " + pinoA.pegaPosicao(pinoA.topo));
				} else {
					pinoB.empilha(discoTopo);
					System.out.println("Nada feito, disco menor");
				}
			}
		} else if (pinoOrigem == 'B' || pinoDestino == 'A') {
			this.messageMovement(pinoOrigem, pinoDestino);
			this.print();
			discoTopo = pinoB.desempilha();

			if (discoTopo == -1) {
				System.out.println("Este cara esTa vazio");
			} else {
				if (pinoC.topo < discoTopo) {
					pinoC.empilha(discoTopo);
					System.out.println("Sim deu certo " + pinoC.pegaPosicao(pinoC.topo));
				} else {
					pinoB.empilha(discoTopo);
					System.out.println("Nada feito, disco menor");
				}
			}
		} else if (pinoOrigem == 'B' || pinoDestino == 'C') {
			this.messageMovement(pinoOrigem, pinoDestino);
			discoTopo = pinoB.desempilha();

			if (discoTopo == -1) {
				System.out.println("Este cara esra vazio");
			} else {
				if (pinoC.topo < discoTopo) {
					pinoC.empilha(discoTopo);
					System.out.println("Sim deu certo " + pinoC.pegaPosicao(pinoC.topo));
				} else {
					pinoB.empilha(discoTopo);
					System.out.println("Nada feito, disco menor");
				}
			}
		} else if (pinoOrigem == 'C' || pinoDestino == 'A') {
			this.messageMovement(pinoOrigem, pinoDestino);
			discoTopo = pinoC.desempilha();

			if (discoTopo == -1) {
				System.out.println("Este cara esra vazio");
			} else {
				if (pinoA.topo < discoTopo) {
					pinoA.empilha(discoTopo);
					System.out.println("Sim deu certo " + pinoA.pegaPosicao(pinoA.topo));
				} else {
					pinoC.empilha(discoTopo);
					System.out.println("Nada feito, disco menor");
				}
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
