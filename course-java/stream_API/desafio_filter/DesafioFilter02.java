package stream_API.desafio_filter;

import tratamento_de_excecoes.Validar;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Placa Mãe GIGABYTE", 10, false);
        Produto p2 = new Produto("Placa de Video GTX 1050 ti", 35, true);
        Produto p3 = new Produto("Processador i5 9400", 30, false);
        Produto p4 = new Produto("Fonte Cooler Master 500W", 30, true);
        Produto p5 = new Produto("Memória RAM DDR4 8GB HyperX", 25, true);
        Produto p6 = new Produto("SSD 480GB Kingston", 40, true);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produto> desconto_30 = aluno -> aluno.desconto >= 30;
        Predicate<Produto> frete_gratis = aluno -> aluno.frete_gratis;
        Function<Produto, String> promocao = aluno -> String.format("Super desconto: %s com %.0f%% de desconto!!!", aluno.nome, aluno.desconto);

        produtos.stream()
                .filter(desconto_30)
                .filter(frete_gratis)
                .map(promocao)
                .forEach(System.out::println);
        // Pipeline de execução
    }
}

class Produto {

    final String nome;
    final double desconto;
    final boolean frete_gratis;

    public Produto(String nome, double desconto, boolean frete_gratis) {
        this.nome = nome;
        this.desconto = desconto;
        this.frete_gratis = frete_gratis;
    }
}