package exercicios;

import java.util.Scanner;

public class Exercicio0802 {
    public static void main(String[] args) {
        /*
        * 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = entrada.next();
        entrada.close();
        int t = palavra.length();
        for(int i = 0; i < t; i++) {
            System.out.println(palavra.charAt(i));
        }
    }
}
