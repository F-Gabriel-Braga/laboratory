package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2"); // Compara os objetos
        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1)); // Compara o conteudo dos objetos

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite \"2\":");
        String s2 = entrada.next();
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
