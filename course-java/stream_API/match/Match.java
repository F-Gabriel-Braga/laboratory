package stream_API.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno3 a1 = new Aluno3("Gabriel", 7.1);
        Aluno3 a2 = new Aluno3("Danilo", 6.1);
        Aluno3 a3 = new Aluno3("Rita", 8.1);
        Aluno3 a4 = new Aluno3("Estefane", 10.0);

        List<Aluno3> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno3> aprovado = a -> a.nota >= 7.0;
        Predicate<Aluno3> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}


class Aluno3 {

    final String nome;
    final double nota;

    public Aluno3(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}
