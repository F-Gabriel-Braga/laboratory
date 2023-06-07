package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        /*
        * Calcular media de três salários informados
        * - Tanto o "," e "." deve ser aceito como entrada
        * */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o sálario 01 (R$):");
        String salario01 = entrada.next().replace(",", ".");
        System.out.println("Digite o sálario 02 (R$):");
        String salario02 = entrada.next().replace(",", ".");
        System.out.println("Digite o sálario 03 (R$):");
        String salario03 = entrada.next().replace(",", ".");
        entrada.close();
        double s1 = Double.parseDouble(salario01);
        double s2 = Double.parseDouble(salario02);
        double s3 = Double.parseDouble(salario03);
        double media = (s1 + s2 + s3) / 3;
        System.out.printf("Media dos salarios é igual a: R$%f\n", media);
    }
}
