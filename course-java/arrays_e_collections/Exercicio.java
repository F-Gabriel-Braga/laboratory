package arrays_e_collections;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.7;
        System.out.println(Arrays.toString(notasAlunoA));
        for(int i = 0; i < notasAlunoA.length; i++) {
            System.out.printf("Nota %d: %.2f\n", (i+1), notasAlunoA[i]);
        }

        double[] notasAlunoB = {6.9, 8.9, 7.0, 5.7};
        System.out.println(Arrays.toString(notasAlunoB));
        for(int i = 0; i < notasAlunoB.length; i++) {
            System.out.printf("Nota %d: %.2f\n", (i+1), notasAlunoB[i]);
        }

    }
}
