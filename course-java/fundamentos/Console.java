package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom");
        System.out.println(" dia!\n");

        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nDigite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("\nDigite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("\nDigite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("\nNome: %s %s\nIdade: %d\n", nome, sobrenome, idade);

        entrada.close();
    }
}
