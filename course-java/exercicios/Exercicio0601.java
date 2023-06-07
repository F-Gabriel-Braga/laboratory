package exercicios;

import java.util.Scanner;

public class Exercicio0601 {
    public static void main(String[] args) {
        /*
        * 6. Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
        * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
        * Encontre o delta.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        int a = entrada.nextInt();
        System.out.println("Digite o valor de b:");
        int b = entrada.nextInt();
        System.out.println("Digite o valor de c:");
        int c = entrada.nextInt();
        entrada.close();
        double delta = (b * b) - (4 * a * c);
        double x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
        double x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
        System.out.println(a + "x^2 + (" + b + "x) + (" + c + ")");
        System.out.println("delta = " + delta);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
