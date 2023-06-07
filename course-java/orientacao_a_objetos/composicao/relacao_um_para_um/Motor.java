package orientacao_a_objetos.composicao.relacao_um_para_um;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if(!ligado) {
            return 0;
        }
        else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
