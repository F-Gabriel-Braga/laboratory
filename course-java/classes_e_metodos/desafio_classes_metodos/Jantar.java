package classes_e_metodos.desafio_classes_metodos;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite seu peso em Kg:");
        double peso = Double.parseDouble(entrada.next());

        System.out.println("Digite o nome da comida 01:");
        String c1 = entrada.next();
        System.out.println("Digite o peso da comida 01 em Kg:");
        double pesoC1 = Double.parseDouble(entrada.next());

        System.out.println("Digite o nome da comida 02:");
        String c2 = entrada.next();
        System.out.println("Digite o peso da comida 01 em Kg:");
        double pesoC2 = Double.parseDouble(entrada.next());
        entrada.close();

        Pessoa pessoa = new Pessoa(nome, peso);
        Comida comida1 = new Comida(c1, pesoC1);
        Comida comida2 = new Comida(c2, pesoC2);

        pessoa.comer(comida1);
        pessoa.comer(comida2);
        System.out.printf("%s comeu %s e %s\n", pessoa.nome, comida1.nome, comida2.nome);
        System.out.printf("%s tem %.2fKg\n", pessoa.nome, pessoa.peso);
    }
}
