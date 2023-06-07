package orientacao_a_objetos.polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa() {

    }

    public Pessoa(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
       if(peso >= 0.0) {
           this.peso = peso;
       }
    }

    // Polimorfismo Dinâmico
    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

    // Polimorfismo Estático (Sobrecarga de Método)
    /*public void comer(Arroz arroz) {
        this.peso += arroz.getPeso();
    }
    public void comer(Feijao feijao) {
        this.peso += feijao.getPeso();
    }
    public void comer(Sorvete sorvete) {
        this.peso += sorvete.getPeso();
    }*/
}
