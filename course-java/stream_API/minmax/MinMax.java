package stream_API.minmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
        public static void main(String[] args) {

            Aluno4 a1 = new Aluno4("Gabriel", 7.1);
            Aluno4 a2 = new Aluno4("Danilo", 6.1);
            Aluno4 a3 = new Aluno4("Rita", 8.1);
            Aluno4 a4 = new Aluno4("Estefane", 10.0);

            List<Aluno4> alunos = Arrays.asList(a1, a2, a3, a4);

            Comparator<Aluno4> melhor_nota = (aluno1, aluno2) -> {
                if(aluno1.nota > aluno2.nota) return 1;
                if(aluno1.nota < aluno2.nota) return -1;
                return 0;
            };

            System.out.println(alunos.stream().max(melhor_nota).get());
            System.out.println(alunos.stream().min(melhor_nota).get());
        }
}


class Aluno4 {

    final String nome;
    final double nota;

    public Aluno4(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome;
    }
}