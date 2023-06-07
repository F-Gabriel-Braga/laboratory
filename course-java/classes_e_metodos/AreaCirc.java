package classes_e_metodos;

public class AreaCirc {
    double raio;
    static final double PI = 3.14;

    AreaCirc(double raio) {
        this.raio = raio;
    }

    double calculaArea() {
        return (raio * raio * PI);
    }
}
