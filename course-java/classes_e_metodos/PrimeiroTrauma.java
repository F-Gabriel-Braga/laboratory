package classes_e_metodos;

public class PrimeiroTrauma {
    // (Membro da Instância) A variavel "a" pertence apenas a intância e não a classe.
    int a = 3;
    // (Membro da Classe) A varivel "b" pertence apenas a classe e não a intância.
    static int b = 4;
    public static void main(String[] args) {

        System.out.println((new PrimeiroTrauma()).a);
        System.out.println(b);
    }
}
