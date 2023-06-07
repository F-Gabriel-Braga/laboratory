package tratamento_de_excecoes;

import tratamento_de_excecoes.excecao_personalizada_B.NumeroForaDoIntervaloException;
import tratamento_de_excecoes.excecao_personalizada_B.StringVaziaException;

public class Validar {
    private Validar() {}

    public static void aluno(Aluno aluno) throws Exception {
        if(aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo.");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        }

        if(aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaDoIntervaloException("nota");
        }
    }
}
