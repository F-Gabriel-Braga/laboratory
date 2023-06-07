package orientacao_a_objetos.heranca.desafio_heranca;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari() {
        super(500);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public double getDelta() {
        if(ligarTurbo && !ligarAr) {
            return 35;
        }
        else if(ligarTurbo && ligarAr) {
            return 30;
        }
        else if(!ligarTurbo && !ligarAr) {
            return 20;
        }
        else {
            return 15;
        }
    }

    @Override
    public boolean acelerar() {
        super.setDelta(this.getDelta());
        return super.acelerar();
    }
}
