package exercicios;

import java.util.Scanner;

public class Exercicio0602 {
    public static void main(String[] args) {
        /*
        * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero
        * aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado.
        * Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima
        * se o número inserido é maior ou menor do que o número armazenado.
        */
        int numero = 17;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivinhe o numero armazenado.");
        for(int tentativa = 9; tentativa >= 0; tentativa--) {
            System.out.println("Digite um numero:");
            int n = entrada.nextInt();
            if(n == numero) {
                System.out.println("Este é o numero correto. Parabens!!!");
                break;
            }
            else {
                if(n > numero) {
                    System.out.printf("%d é maior do que o numero armazenado.\n", n);
                }
                else {
                    System.out.printf("%d é menor do que o numero armazenado.\n", n);
                }
                System.out.printf("Você tem apenas %d tentativas restantes.\n", tentativa);
            }
        }
        entrada.close();
    }
}
