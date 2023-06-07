package orientacao_a_objetos.composicao.relacao_um_para_muitos;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "Estefane Veras";
        compra.adicionarItem("Caneta", 20, 1.5);
        compra.adicionarItem("Saco de Café", 80, 10);
        compra.adicionarItem(new Item("Hamburguer", 5, 15));
        compra.adicionarItem(new Item("Refrigerante", 2, 10));

        System.out.println(compra.itens.size());
        System.out.println(compra.obterValorTotal());

        System.out.println(compra.itens.get(0).compra.itens.get(0).compra.cliente); // Relação Bidirecional
    }
}
