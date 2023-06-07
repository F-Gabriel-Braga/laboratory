package exercicios;

import java.util.Scanner;

public class Exercicio0101 {
    public static void main(String[] args) {
        /*
        * 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        */
        Scanner entrada = new Scanner(System.in);
        double celsius = entrada.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        entrada.close();
    }
}
