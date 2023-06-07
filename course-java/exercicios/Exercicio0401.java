package exercicios;

import java.util.Scanner;

public class Exercicio0401 {
    public static void main(String[] args) {
        /*
        * 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = entrada.nextInt();
        System.out.println(n + "^" + 2 + " = " + (Math.pow(n, 2)));
        System.out.println(n + "^" + 3 + " = " + (Math.pow(n, 3)));
        entrada.close();
    }
}
