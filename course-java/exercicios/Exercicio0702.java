package exercicios;

import java.util.Scanner;

public class Exercicio0702 {
    public static void main(String[] args) {
        /*
        * 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console
        * a soma dos números inseridos, caso receba um número negativo, encerre o programa.
        * Tente utilizar a estrutura do while.
        */
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int soma = 0;
        while(!(n < 0)) {
            System.out.println("Digite um numero:");
            n = entrada.nextInt();
            if(n > 0) {
                soma += n;
                System.out.printf("Soma dos numeros inseridos: %d\n", soma);
            }
        }
        entrada.close();
    }
}
