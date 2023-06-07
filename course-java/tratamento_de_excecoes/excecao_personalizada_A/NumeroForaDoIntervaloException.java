package tratamento_de_excecoes.excecao_personalizada_A;

public class NumeroForaDoIntervaloException extends RuntimeException {
    private String nomeDoAtributo;
    public NumeroForaDoIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo.", nomeDoAtributo);
    }
}
