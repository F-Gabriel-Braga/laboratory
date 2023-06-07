package teste.heranca;

import estrutura.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {

        DAO<Aluno> dao = new DAO<>();
        Aluno aluno = new Aluno(123L, "João");
        AlunoBolsista alunoB = new AlunoBolsista(321L, "Maria", 1000.0);

        dao.incluirAtomico(aluno);
        dao.incluirAtomico(alunoB);

        dao.fechar();
    }
}
