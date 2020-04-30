
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

	Pilha retornaPilha(char pilha) throws Exception {

		switch (pilha) {
		case 'A':
			return pinoA;

		case 'B':
			return pinoB;

		case 'C':
			return pinoC;

		default:
			throw new Exception();

		}

	}

	public void move(char pinoOrigem, char pinoDestino) {

		try {
			if (this.retornaPilha(pinoDestino).topo > this.retornaPilha(pinoOrigem).topo) {
				this.retornaPilha(pinoDestino).empilha(this.retornaPilha(pinoOrigem).desempilha());
			} else {
				System.out.println("Erro. Tente novamente");
			}
		} catch (Exception e) {
			System.out.println("Ops. vc escolheu errado");
			e.printStackTrace();
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
