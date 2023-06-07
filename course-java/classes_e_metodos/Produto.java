package classes_e_metodos;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto() {
        return (preco * (1 - desconto));
    }

    void alterarDesconto(double desc) {
        desconto = desc;
    }
}
