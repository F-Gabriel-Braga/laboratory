package stream_API.desafio_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter01 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, 'F', 19);
        Aluno a2 = new Aluno("Bia", 5.8, 'F', 12);
        Aluno a3 = new Aluno("Daniel", 9.8, 'M', 21);
        Aluno a4 = new Aluno("Gui", 6.8, 'M', 14);
        Aluno a5 = new Aluno("Rebeca", 7.1, 'F', 23);
        Aluno a6 = new Aluno("Pedro", 8.8, 'M', 21);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> masculino = aluno -> aluno.sexo == 'M';
        Predicate<Aluno> maior_idade = aluno -> aluno.idade >= 18;

        alunos.stream().filter(masculino).filter(maior_idade).map(aluno -> aluno.nome).forEach(System.out::println);
    }
}


class Aluno {

    final String nome;
    final double nota;
    final char sexo;
    final int idade;

    public Aluno(String nome, double nota, char sexo, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.sexo = sexo;
        this.idade = idade;
    }
}