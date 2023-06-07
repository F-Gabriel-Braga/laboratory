package stream_API.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel", 7.1);
        Aluno a2 = new Aluno("Danilo", 6.1);
        Aluno a3 = new Aluno("Rita", 8.1);
        Aluno a4 = new Aluno("Estefane", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno, Double> apenas_nota = a -> a.nota;
        BinaryOperator<Double> somatoria = (a, b) -> a+b;

        alunos.stream().filter(aprovado).map(apenas_nota).reduce(somatoria).ifPresent(System.out::println);

    }
}

class Aluno {

    final String nome;
    final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}