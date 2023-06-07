package teste.umparaum;

import estrutura.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> daoC = new DAO<>(Cliente.class);
        Cliente cliente = daoC.obterPorId(5L);
        System.out.println(cliente.getAssento().getNome());

        DAO<Assento> daoA = new DAO<>(Assento.class);
        Assento assento = daoA.obterPorId(5L);
        System.out.println(assento.getCliente().getNome());


        daoC.fechar();
        daoA.fechar();
    }
}
