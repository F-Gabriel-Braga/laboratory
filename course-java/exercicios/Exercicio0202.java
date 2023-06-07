package exercicios;

import java.util.Scanner;

public class Exercicio0202 {
    public static void main(String[] args) {
        /*
        * 2. Criar um programa informa se o ano atual é um ano bissexto;
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano atual");
        int ano = entrada.nextInt();
        for(int bissexto = 2004; bissexto <= ano; bissexto = bissexto + 4) {
            if(bissexto == ano) {
                System.out.println("Esse ano é bissexto");
            }
        }
        entrada.close();
    }
}
