package exercicios;

import java.util.Scanner;

public class Exercicio0302 {
    public static void main(String[] args) {
        /*
        * 3. Criar um programa que receba duas notas parciais, calcular a média final.
        * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        * caso contrário imprime no console "Reprovado".
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite nota 1:");
        int n1 = entrada.nextInt();
        System.out.println("Digite nota 2:");
        int n2 = entrada.nextInt();
        int media = (n1 + n2) / 2;

        if(media >= 7) {
            System.out.println("Aprovado.");
        }
        else if(media < 7 && media > 4) {
            System.out.println("Recuperacao.");
        }
        else {
            System.out.println("Reprovado.");
        }
        entrada.close();
    }
}
