package lambdas.interfaces_funcionais;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2.0;
        Function<Double, String> conceito = numero -> (numero >= 7 ? "Aprovado" : "Reprovado");
        System.out.println(media.andThen(conceito).apply(7.0, 8.0));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(7.0, 8.0));
    }
}
