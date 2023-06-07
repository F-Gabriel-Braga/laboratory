package stream_API.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {
    public static void main(String[] args) {
        //Media m1 = new Media().adicionar(8.3).adicionar(6.7);
        //System.out.println(m1.getValor());

        Aluno a1 = new Aluno("Gabriel", 7.1);
        Aluno a2 = new Aluno("Danilo", 6.1);
        Aluno a3 = new Aluno("Rita", 8.1);
        Aluno a4 = new Aluno("Estefane", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno, Double> apenas_nota = a -> a.nota;

        BiFunction<Media, Double, Media> calcular_media = (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinar_media = (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream().filter(aprovado).map(apenas_nota).reduce(new Media(), calcular_media, combinar_media);
        System.out.println("Media do turma é : " + media.getValor());
    }
}

class Media {
    private double total;
    private int quantidade;

    public Media adicionar(double valor) {
        total += valor;
        quantidade++;
        return this;
    }

    public double getValor() {
        return total / quantidade;
    }

    public static Media combinar(Media m1, Media m2) {
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.quantidade = m1.quantidade + m2.quantidade;
        return resultante;
    }
}


class Aluno2 {

    final String nome;
    final double nota;

    public Aluno2(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}