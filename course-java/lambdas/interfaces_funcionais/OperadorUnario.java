package lambdas.interfaces_funcionais;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = numero -> (numero + 2);
        UnaryOperator<Integer> vezesDois = numero -> (numero * 2);
        UnaryOperator<Integer> aoQuadrado = numero -> (numero * numero);

        System.out.println(
                maisDois // Primeira a ser executada
                .andThen(vezesDois) // Segunda a ser executada
                .andThen(aoQuadrado) // Terceira a ser executada
                .apply(1)
        );

        System.out.println(
                aoQuadrado // Terceira a ser executada
                .compose(vezesDois) // Segunda a ser executada
                .compose(maisDois) // Primeira a ser executada
                .apply(1)
        );
    }
}
