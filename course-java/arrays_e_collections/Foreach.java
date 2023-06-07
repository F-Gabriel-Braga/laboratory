package arrays_e_collections;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = {6.0, 7.0, 9.0, 10.0, 8.0};

        double soma = 0.0;
        double media = 0.0;
        for(double nota: notas) {
            System.out.printf("%.1f\n", nota);
            soma += nota;
        }
        media = soma / notas.length;
        System.out.println("Media: " + media);
    }
}
