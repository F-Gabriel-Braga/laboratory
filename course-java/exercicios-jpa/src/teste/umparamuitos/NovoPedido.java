package teste.umparamuitos;

import estrutura.DAO;
import modelo.basico.Produto;
import modelo.umparamuitos.*;

public class NovoPedido {

    public static void main(String[] args) {

        DAO dao = new DAO();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Memória Ram 8GB HyperX", 319.89);
        ItemPedido itemPedido = new ItemPedido(pedido, produto, 10);

        dao.abrirTransacao().incluir(produto).incluir(pedido).incluir(itemPedido).fecharTransacao().fechar();
    }
}