package estruturas_de_controle;

public class For1 {
    public static void main(String[] args) {

        for(int contador = 1; contador <= 10; contador++) {
            System.out.println("Bom dia!");
        }

        System.out.println("\n");

        int contador = 1;
        for(; contador <= 10;) {
            System.out.println("Bom dia!");
            contador++;
        }

        // Laço infinito
        /*for(;;) {
            System.out.println("LOOP");
        }*/

    }
}
