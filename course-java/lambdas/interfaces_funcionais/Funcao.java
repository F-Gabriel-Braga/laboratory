package lambdas.interfaces_funcionais;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> (numero % 2 == 0 ? "Par": "Ímpar");
        System.out.println(parOuImpar.apply(45));

        Function<String, String> empolgado = valor -> (valor + "!!!!");

        Function<String, String> oResultadoE = valor -> ("O resultado é: " + valor);
        System.out.println( // Composição de Funções
            parOuImpar
            .andThen(oResultadoE) // e então o resultado
            .andThen(empolgado) // e então empolgado
            .apply(54)
        );
    }
}
