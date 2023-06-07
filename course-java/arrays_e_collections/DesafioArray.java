package arrays_e_collections;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        /*
        * Calcular a média das notas de um aluno usando Array
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a quantidade de notas?");
        double media = 0.0;
        double soma = 0.0;
        int qntNotas = entrada.nextInt();
        double[] notas = new double[qntNotas];
        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota %d:\n", (i+1));
            notas[i] = Double.parseDouble(entrada.next());
        }
        entrada.close();
        for(double nota: notas) {
            soma += nota;
        }
        media = soma / notas.length;
        System.out.printf("Media: %.1f", media);
    }
}
