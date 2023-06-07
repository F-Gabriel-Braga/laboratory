package estruturas_de_controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        /*
        * Calcular media das notas de uma turma.
        * - O número de alunos é desconhecido.
        * - A captura das notas deve ser feita pela estrutura de repetiçãp while
        * - O comando para sair do LOOP deve ser "-1"
        * - Apenas as notas válidas (entre 0 e 10) devem ser contadas
        *
        * 1 - Capturar as notas com while
        * 2 - Validar a nota digitada
        * 3 - Recalcular total das soma das notas
        * 4 - Recalcular o numero de alunos
        * 5 - Verificar comando de saida
        * 6 - Calcular media e imprimir
        * */
        Scanner entrada = new Scanner(System.in);
        double nota = 0.0, totalNotas = 0.0, media = 0.0;
        int qntAlunos = 0;
        while(!(nota == -1.0)) {
            System.out.print ("Digite a nota: ");
            nota = entrada.nextDouble();
            if(nota >= 0 && nota <= 10) {
                totalNotas += nota;
                qntAlunos++;
            }
        }
        media = totalNotas / qntAlunos;
        System.out.printf("Media: %.2f", media);
        entrada.close();
    }
}
