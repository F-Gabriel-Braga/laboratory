package tratamento_de_excecoes;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println(7 / entrada.nextInt());
        }
        catch(Exception ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
        finally {
            entrada.close();
        }
        System.out.println("FIM!");
    }
}
