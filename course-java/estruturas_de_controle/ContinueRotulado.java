package estruturas_de_controle;

public class ContinueRotulado {
    public static void main(String[] args) {
        externo:
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == 1) {
                    // Rotulando o for mais externo é possivel da referencia ao continue de qual fluxo ele deve seguir.
                    continue externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.print("\n");
        }
    }
}
