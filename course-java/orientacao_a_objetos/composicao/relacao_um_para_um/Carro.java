package orientacao_a_objetos.composicao.relacao_um_para_um;

public class Carro {
    Motor motor;

    void acelerar() {
        motor.fatorInjecao += 0.5;
    }

    void frear() {
        motor.fatorInjecao -= 0.5;
    }

    void ligar() {
        motor.ligado = true;
    }

    void deligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

    public Carro() {
        this.motor = new Motor();
    }
}
