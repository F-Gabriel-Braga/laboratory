package tratamento_de_excecoes;

public class Causa {
    public static void main(String[] args) {
        // Exceções podem ser causa de outra exceção.
        // A causa do erro pode ser completamente diferente da causa final informada.
        try {
            metodoA(null);
        }
        catch(Exception erro) {
            if(erro.getCause() != null) {
                System.err.println("CAUSA: " + erro.getCause().getMessage());
            }
            else {
                System.err.println("ERRO: " + erro.getMessage());
            }
        }
    }

    public static void metodoA(Aluno aluno) {
        try {
            metodoB(aluno);
        }
        catch(Exception causa) {
            throw new IllegalArgumentException(causa);
        }
    }

    public static void metodoB(Aluno aluno) {
        if(aluno == null) {
            throw new IllegalArgumentException("Aluno está nulo.");
        }
        System.out.println(aluno.nome);
    }
}
