package teste.umparamuitos;

import estrutura.DAO;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<Pedido>(Pedido.class);

        Pedido pedido = dao.obterPorId(1L);
         for(ItemPedido itemPedido : pedido.getItens()) {
             System.out.println(itemPedido.getProduto().getNome()+" : "+itemPedido.getQuantidade());
         }

        dao.fechar();
    }
}
