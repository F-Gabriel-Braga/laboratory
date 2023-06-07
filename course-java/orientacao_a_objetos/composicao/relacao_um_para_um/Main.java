package orientacao_a_objetos.composicao.relacao_um_para_um;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println(c.estaLigado());
        c.ligar();
        System.out.println(c.estaLigado());
        System.out.println(c.motor.giros());

        System.out.println(c.motor.giros());

        c.frear();
        c.frear();
        c.frear();
        c.frear();

        System.out.println(c.motor.giros());
    }
}
