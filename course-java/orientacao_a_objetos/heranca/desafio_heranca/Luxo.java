package orientacao_a_objetos.heranca.desafio_heranca;

public interface Luxo {
    // public abstract
    void ligarAr();
    void desligarAr();
    default int velocidadeDoAr() {
        return 1;
    }
}
