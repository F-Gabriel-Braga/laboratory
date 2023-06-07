package tratamento_de_excecoes;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            gerarErro1();
        }
        catch (RuntimeException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            gerarErro2();
        }
        catch(Exception ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("FIM");
    }

    // Exceção Não checada ou Não Verificada -> Não tem obrigatoriedade de ser tratada
    private static void gerarErro1() {
        // Lançar erro
        throw new RuntimeException("Ocorreu um ERRO bem legal #1");
    }

    // Exceção Checada ou Verificada -> Tem obrigatoriedade de ser tratada
    private static void gerarErro2() throws Exception {
        throw new Exception("Ocorreu um ERRO bem legal #2");
    }
}
