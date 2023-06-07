package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        // Forma tracicional
        for(String aprovado: aprovados) {
            System.out.println(aprovado);
        }

        // Usando Lambda 1
        aprovados.forEach((aprovado) -> {System.out.println(aprovado + "!!!!");});
        //aprovados.forEach(aprovado -> System.out.println(aprovado + "!!!!"););

        // Usando Lambda 2
        aprovados.forEach((aprovado) -> meuImprimir(aprovado));

        // Method Reference 1
        aprovados.forEach(System.out::println); // Para cada aprovado chame println dew System.out

        // Method Reference 2
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome + ".");
    }
}
