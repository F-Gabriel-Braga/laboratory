package estruturas_de_controle;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        // Switch com break
        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.print("Digite uma nota valida: ");
        int nota = entrada.nextInt();

        switch(nota) {
            case 10: case 9:
                 conceito = "A";
                 break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
            default:
                conceito = "não definido!";
                break;
        }
        System.out.println("Conceito " + conceito);
        entrada.close();
    }
}
