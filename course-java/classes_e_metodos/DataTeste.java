package classes_e_metodos;

import java.util.Scanner;

public class DataTeste {
    public static void main(String args[]) {
        Data data1 = new Data("30", "Dezembro", "2018");
        System.out.println(data1.obterDataFormatada());

        Data data2 = new Data();
        System.out.println(data2.obterDataFormatada());

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia:");
        String dia = entrada.next();
        System.out.println("Digite o mes:");
        String mes = entrada.next();
        System.out.println("Digite o ano:");
        String ano = entrada.next();
        entrada.close();
        Data data3 = new Data(dia, mes, ano);
        System.out.println(data3.obterDataFormatada());
    }
}