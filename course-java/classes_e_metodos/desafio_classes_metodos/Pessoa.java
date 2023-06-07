package classes_e_metodos.desafio_classes_metodos;

public class Pessoa {

    public Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    String nome;
    double peso;

    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }
}
