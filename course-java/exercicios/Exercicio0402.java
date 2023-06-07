package exercicios;

import java.util.Scanner;

public class Exercicio0402 {
    public static void main(String[] args) {
        /*
        * 4. Criar um programa que receba um número e diga se ele é um número primo.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = entrada.nextInt();
        boolean primo = true;
        for(int i = 2; i < n; i++) {
            if((n % i) == 0) {
                primo = false;
                break;
            }
        }
        if(primo) {
            System.out.println("Primo.");
        }
        else {
            System.out.println("Não primo.");
        }
        entrada.close();
    }
}
