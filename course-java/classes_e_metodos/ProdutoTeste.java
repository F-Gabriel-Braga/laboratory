package classes_e_metodos;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3_999.99;

        Produto p2 = new Produto("Caneta", 1.99);

        Produto.desconto = 0.25;
        System.out.println(p1.nome);
        double preco1 = p1.precoComDesconto();
        System.out.println(preco1);

        Produto.desconto = 0.30;
        System.out.println(p2.nome);
        double preco2 = p2.precoComDesconto();
        System.out.println(preco2);

        System.out.println("Total " + (preco1 + preco2));
    }
}
