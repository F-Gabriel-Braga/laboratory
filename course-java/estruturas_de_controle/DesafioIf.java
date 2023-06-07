package estruturas_de_controle;

public class DesafioIf {
    public static void main(String args[]) {
        //Encontrar o BUG no código abaixo

        double nota = 1.3;

        if(nota >= 9.0); {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!!!");
        }
        // if(nota >= 9.0)
        //     ;
        // {
        //     System.out.println("Quadro de Honra!");
        //     System.out.println("Você é fera!!!!!");
        // }
    }
}
