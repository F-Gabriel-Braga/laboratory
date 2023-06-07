package orientacao_a_objetos.composicao.desafio_composicao;

public class Main {
    public static void main(String[] args) {
        // Produtos
        Produto p1 = new Produto("Chocolate", 5.0);
        Produto p2 = new Produto("Café", 12.0);
        Produto p3 = new Produto("Biscoito", 2.0);
        Produto p4 = new Produto("Pipoca", 6.0);

        // Clientes
        Cliente cl1 = new Cliente("Gabriel");
        Cliente cl2 = new Cliente("Estefane");

        // Compras
        Compra c1 = new Compra(cl1);
        Compra c2 = new Compra(cl2);

        c1.adicionarItem(p1, 2);
        c1.adicionarItem(p3, 4);
        c1.adicionarItem(p4, 1);

        c2.adicionarItem(p1, 10);
        c2.adicionarItem(p2, 20);

        System.out.println(cl1.nome + " R$ " + cl1.obterTotalDasCompras());
        System.out.println(cl2.nome + " R$ " + cl2.obterTotalDasCompras());
    }
}
