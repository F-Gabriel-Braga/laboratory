package lambdas.interfaces_funcionais;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = produto -> (produto.preco > 100);
        Produto produto = new Produto("Notebook", 5000.00, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
