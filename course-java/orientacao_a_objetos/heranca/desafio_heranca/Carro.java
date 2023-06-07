package orientacao_a_objetos.heranca.desafio_heranca;

public class Carro {
    public double velocidade = 0;
    protected final double VELOCIDADE_MAXIMA;
    private double delta;

    Carro(double velocidade_maxima) {
        this.VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    public boolean acelerar() {
        if((velocidade + delta) < VELOCIDADE_MAXIMA) {
            velocidade += delta;
            return true;
        }
        else {
            velocidade = VELOCIDADE_MAXIMA;
            return false;
        }
    }

    public boolean frear() {
        if(velocidade >= 5) {
            velocidade -= 5.0;
            return true;
        }
        else {
            velocidade = 0.0;
        }
        return false;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
}
