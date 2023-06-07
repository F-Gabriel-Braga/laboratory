package lambdas.lambda;

import java.util.function.BinaryOperator;

public class TesteLambda2 {
    public static void main(String[] args) {

        // SIM: double -> Double
        // NÃO: int -> Double

        BinaryOperator<Double> calculo;
        calculo = (x, y) -> x+y;
        System.out.println(calculo.apply(10.0, 2.0));
        calculo = (x, y) -> x-y;
        System.out.println(calculo.apply(10.0, 2.0));
        calculo = (x, y) -> x*y;
        System.out.println(calculo.apply(10.0, 2.0));
        calculo = (x, y) -> x/y;
        System.out.println(calculo.apply(10.0, 2.0));

        BinaryOperator<Integer> calculo2;
        calculo2 = (x, y) -> x+y;
        System.out.println(calculo2.apply(20, 5));
        calculo2 = (x, y) -> x-y;
        System.out.println(calculo2.apply(20, 5));
        calculo2 = (x, y) -> x*y;
        System.out.println(calculo2.apply(20, 5));
        calculo2 = (x, y) -> x/y;
        System.out.println(calculo2.apply(20, 5));

    }
}
