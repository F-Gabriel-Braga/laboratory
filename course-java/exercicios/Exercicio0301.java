package exercicios;

import java.util.Scanner;

public class Exercicio0301 {
    public static void main(String[] args) {
        /*
        * 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a altura: (m)");
        double altura = Double.parseDouble(entrada.nextLine().replace(",", "."));
        System.out.println("Digite o peso: (kg)");
        double peso = Double.parseDouble(entrada.nextLine().replace(",", "."));
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        entrada.close();
    }
}
