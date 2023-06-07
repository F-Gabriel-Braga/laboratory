package tratamento_de_excecoes;

public class Basico {
    public static void main(String[] args) {
        try {
            System.out.println(7 / 0);
        }
        catch(ArithmeticException ex) {
            System.err.println("ERRO: VALOR ARITMETICO INVALIDO" + ex.getMessage());
        }
        Aluno aluno = null;
        imprimirNomeAluno(aluno);
    }
    static void imprimirNomeAluno(Aluno aluno) {
        try {
            System.out.println(aluno.nome);
        }
        catch (NullPointerException ex) {
            System.err.println("ERRO: VALOR NULO" + ex.getMessage());
        }
    }

}
