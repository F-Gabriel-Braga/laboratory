package orientacao_a_objetos.composicao.relacao_muitos_para_muitos;

import java.util.ArrayList;

public class Aluno {
    final String nome;
    final ArrayList<Curso> cursos = new ArrayList<Curso>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nomeCurso) {
        for(Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nomeCurso)) {
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nome;
    }
}
