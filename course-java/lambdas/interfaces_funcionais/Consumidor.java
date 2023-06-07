package lambdas.interfaces_funcionais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir =  produto -> System.out.println(produto.nome + " => R$" + produto.preco);
        Produto p1 = new Produto("Caneta", 12.5, 0.50);
        imprimir.accept(p1);

        Produto p2 = new Produto("Borracha", 2.0, 0.50);
        Produto p3 = new Produto("Lapis", 4.0, 0.50);
        Produto p4 = new Produto("Corretivo", 6.0, 0.50);
        Produto p5 = new Produto("Apontador", 2.0, 0.50);
        Produto p6 = new Produto("Caderno", 20.0, 0.50);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.nome));
    }
}