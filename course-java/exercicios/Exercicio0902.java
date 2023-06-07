package exercicios;

import java.util.Scanner;

public class Exercicio0902 {
    public static void main(String[] args) {
        /*
        * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
        */
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int maior = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            n = entrada.nextInt();
            if(n > maior) {
                maior = n;
            }
        }
        System.out.printf("Maior numero: %d", maior);
        entrada.close();
    }
}
