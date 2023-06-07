package exercicios;

import java.util.Scanner;

public class Exercicio0502 {
    public static void main(String[] args) {
        /*
        * 5. Refatorar o exercício 04, utilizando a estrutura switch.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = entrada.nextInt();
        int primo = 0;
        for(int i = 2; i < n; i++) {
            if((n % i) == 0) {
                primo++;
                break;
            }
        }
        switch(primo) {
            case 0:
                System.out.println("Primo.");
                break;
            case 1:
                System.out.println("Não primo.");
                break;
        }

        entrada.close();
    }
}
