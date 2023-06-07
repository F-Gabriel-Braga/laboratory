package exercicios;

import java.util.Scanner;

public class Exercicio0102 {
    public static void main(String[] args) {
        /*
        * 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = entrada.nextInt();
        if(n >= 0 && n <= 10) {
            System.out.println("O numero esta entre 0 e 10.");
        }
        if(n % 2 == 0) {
            System.out.println("O numero é par.");
        }
        entrada.close();
    }
}
