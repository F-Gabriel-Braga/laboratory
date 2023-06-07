package exercicios;

import java.util.Scanner;

public class Exercicio0201 {
    public static void main(String[] args) {
        /*
         * 2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
         */
        Scanner entrada = new Scanner(System.in);
        double fahrenheit = entrada.nextDouble();
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
        entrada.close();
    }
}
