package teste.muitosparamuitos;

import estrutura.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filme1 = new Filme("Star Wars", 8.9);
        Filme filme2 = new Filme("O Fugitivo", 7.1);

        Ator ator1 = new Ator("Harrison Ford");
        Ator ator2 = new Ator("Carrie Fisher");

        filme1.adicionarAtor(ator1);
        filme1.adicionarAtor(ator2);

        filme2.adicionarAtor(ator1);

        DAO dao = new DAO();
        dao.incluirAtomico(filme1);
    }
}
