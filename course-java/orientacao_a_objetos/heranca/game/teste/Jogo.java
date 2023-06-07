package orientacao_a_objetos.heranca.game.teste;

import orientacao_a_objetos.heranca.game.Heroi;
import orientacao_a_objetos.heranca.game.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro(10,10);

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro: " + monstro.vida);
        System.out.println("Heroi: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro: " + monstro.vida);
        System.out.println("Heroi: " + heroi.vida);
    }
}
