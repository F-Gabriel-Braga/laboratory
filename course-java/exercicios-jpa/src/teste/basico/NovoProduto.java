package teste.basico;

import estrutura.DAO;
import modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Livro", 43.0);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto);

        System.out.println("Id: " + produto.getId());
    }
}