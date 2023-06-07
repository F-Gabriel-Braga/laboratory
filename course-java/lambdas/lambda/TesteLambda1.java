package lambdas.lambda;

public class TesteLambda1 {
    public static void main(String[] args) {
//        Calculo soma = new Somar();
//        Calculo multiplica = new Multiplicar();
//        System.out.println(soma.executar(4 ,5));
//        System.out.println(multiplica.executar(4, 5));

        Calculo soma = (x, y) -> { return x + y; }; // JavaScript => Java ->

        Calculo mutiplica = (x, y) -> x * y;

        System.out.println(soma.executar(4, 5));
        System.out.println(mutiplica.executar(4, 5));
    }
}
