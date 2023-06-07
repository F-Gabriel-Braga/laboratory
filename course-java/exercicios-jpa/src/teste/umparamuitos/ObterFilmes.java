package teste.umparamuitos;

import estrutura.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

import java.util.List;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesNotaMaiorQue", "nota", 6.5);

        for(Filme filme : filmes) {
            System.out.println(filme.getNome());
            for (Ator ator : filme.getAtores())
                System.out.println("-" + ator.getNome());
        }
    }
}
