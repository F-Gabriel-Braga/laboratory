package estruturas_de_controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double nota1 = Double.parseDouble(entrada.next().replace(",", "."));
        System.out.println("Digite a nota 2:");
        double nota2 = Double.parseDouble(entrada.next().replace(",", "."));
        double media = (nota1 + nota2) / 2;
        System.out.println(media);

        if(media <= 10 && media  >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        }

        if(media < 7 && media >= 4.5) {
            System.out.println("Recuperação!");
        }

        if(media < 4.5 && media >= 0) {
            System.out.println("Reprovado!");
        }
        entrada.close();
    }
}
