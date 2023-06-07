package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Exercicios {

    static class Aluno {

        final String nome;
        final double nota;

        public Aluno(String nome, double nota) {
            this.nome = nome;
            this.nota = nota;
        }

        @Override
        public String toString() {
            return nome;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Aluno aluno = (Aluno) o;
            return Double.compare(aluno.nota, nota) == 0 && Objects.equals(nome, aluno.nome);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, nota);
        }
    }

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Gabriel", 7.1);
        Aluno a2 = new Aluno("Danilo", 6.1);
        Aluno a3 = new Aluno("Rita", 8.1);
        Aluno a4 = new Aluno("Estefane", 10.0);
        Aluno a5 = new Aluno("Gabriel", 7.1);
        Aluno a6 = new Aluno("Tatiane", 6.1);
        Aluno a7 = new Aluno("Rita", 8.1);
        Aluno a8 = new Aluno("Maria", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7.0)
                .forEach(System.out::println);
}
}