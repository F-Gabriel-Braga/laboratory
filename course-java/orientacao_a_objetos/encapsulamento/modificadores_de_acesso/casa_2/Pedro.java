package orientacao_a_objetos.encapsulamento.modificadores_de_acesso.casa_2;

import orientacao_a_objetos.encapsulamento.modificadores_de_acesso.casa_1.Ana;

public class Pedro extends Ana {
    // Ana mae = new Ana();
    void testeAcessos() {
        // System.out.println(mae.segredo);
        // System.out.println(mae.emCasa);
        System.out.println(formaDeFalar); // Por herança
        System.out.println(todosSabem); // Por herança
    }
}
