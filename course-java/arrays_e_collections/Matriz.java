package arrays_e_collections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        double media = 0.0;
        double soma = 0.0;
        int qntNotas = 0;
        int qntAlunos = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a quantidade de alunos da turma?");
        qntAlunos = entrada.nextInt();
        System.out.println("Qual a quantidade de notas de cada aluno?");
        qntNotas = entrada.nextInt();
        double[][] notas = new double[qntAlunos][qntNotas];
        for(int i = 0; i < qntAlunos; i++) {
            for(int j = 0; j < qntNotas; j++) {
                System.out.printf("Digite a nota %d do aluno %d:\n", (j+1), (i+1));
                notas[i][j] = Double.parseDouble(entrada.next());
            }
        }
        entrada.close();
        for(double[] aluno: notas) {
            for(double nota: aluno) {
                soma += nota;
            }
            System.out.println(Arrays.toString(aluno));
        }
        media = soma / (qntAlunos * qntNotas);
        System.out.printf("Media das notas da turma: %.1f\n", media);
    }
}
