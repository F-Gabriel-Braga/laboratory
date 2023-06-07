package teste.umparaum;

import estrutura.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {
        Assento assento = new Assento("12A");
        Cliente cliente = new Cliente("Bia", assento);

        DAO dao = new DAO();
        dao.abrirTransacao().incluir(assento).incluir(cliente).fecharTransacao().fechar();
    }
}
