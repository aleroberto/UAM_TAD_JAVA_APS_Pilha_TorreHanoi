/**
 * @autor: Alexandre Roberto RA 
 * @autor: honatan Lima Ra 
 **/

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

        int checkDestino = -1;
        try {
            checkDestino = this.atribuirPilha(destino).vetor[this.atribuirPilha(destino).topo == -1 ? 0
                           : this.atribuirPilha(destino).topo];
            return (atribuirPilha(pinoOrigem).pilhaVazia()
                    || (atribuirPilha(pinoOrigem).vetor[atribuirPilha(pinoOrigem).topo] > checkDestino
                        && checkDestino != 0));
        } catch (Exception e) {
            System.out.println("");
        }
        return false;

    }

    public void move(char pinoOrigem, char pinoDestino) {

        try {
            if (checks(pinoOrigem, pinoDestino) || pinoOrigem == pinoDestino) {
                System.out.println("ERRRRROU.... Movimento incorreto: " + pinoOrigem + "  e  " + pinoDestino);
            } else {
                try {
                    this.atribuirPilha(pinoDestino).empilha(this.atribuirPilha(pinoOrigem).desempilha());
                    this.atribuirPilha(pinoOrigem).vetor[this.atribuirPilha(pinoOrigem).topo + 1] = 0;
                } catch (Exception e) {
                    System.out.println("ERRRRROU.... Movimento incorreto: " + pinoOrigem + "  e  " + pinoDestino);
                }
            }
        } catch (Exception e) {
            System.out.println("ERRRRROU.... Movimento incorreto: " + pinoOrigem + "  e  " + pinoDestino);
            e.printStackTrace();
        }
    }

    public Pilha atribuirPilha(char pilhaCorrespondente) throws Exception {

        switch (pilhaCorrespondente) {
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

    public void print() {
        for (int i = 2; i >= 0; i--) {
            System.out.println((pinoA.vetor[i] == 0 ? '-' : Integer.toString(pinoA.vetor[i])) + " | "
                               + (pinoB.vetor[i] == 0 ? '-' : Integer.toString(pinoB.vetor[i])) + " | "
                               + (pinoC.vetor[i] == 0 ? '-' : Integer.toString(pinoC.vetor[i])));
        }
        System.out.println("A | B | C\n");
    }
}
