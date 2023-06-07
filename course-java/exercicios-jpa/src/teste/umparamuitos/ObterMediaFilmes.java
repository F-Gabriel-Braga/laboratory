package teste.umparamuitos;

import estrutura.DAO;
import modelo.consulta.NotaFilme;

public class ObterMediaFilmes {

    public static void main(String[] args) {

        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme notaFilme = dao.consultarUm("obterMediaNotasFilmes");

        System.out.println(notaFilme.getMedia());
    }
}
