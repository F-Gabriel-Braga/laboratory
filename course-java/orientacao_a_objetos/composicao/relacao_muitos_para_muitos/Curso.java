package orientacao_a_objetos.composicao.relacao_muitos_para_muitos;

import java.util.ArrayList;

public class Curso {
    final String nome;
    final ArrayList<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Curso) {
            return this.nome.equals(((Curso) obj).nome);
        }
        return false;
    }
}
