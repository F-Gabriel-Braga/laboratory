package exercicios;

import java.util.Scanner;

public class Exercicio0501 {
    public static void main(String[] args) {
        /*
        * 5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do triangulo:");
        double base = Double.parseDouble(entrada.next().replace(",", "."));
        System.out.println("Digite a altura do triangulo:");
        double altura = Double.parseDouble(entrada.next().replace(",", "."));
        double area = (base * altura) / 2;
        System.out.println("Area do triangulo = " + area);
        entrada.close();
    }
}
