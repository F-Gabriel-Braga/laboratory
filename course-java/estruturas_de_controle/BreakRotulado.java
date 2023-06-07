package estruturas_de_controle;

public class BreakRotulado {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == 1) {
                    // Esse break quebra apenas o fluxo da iteração do for mais interno.
                    break;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        externo:
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == 1) {
                    // Rotulando o for mais externo é possivel passar a referência ao break de qual fluxo ele deve interromper.
                    break externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.print("\n");
        }
    }
}
