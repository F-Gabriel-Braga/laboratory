package estruturas_de_controle;

public class For2 {
    public static void main(String[] args) {
        // Mini desafio: criar um for descrecente de 2 em 2 começando de 10.

        for(int contador = 10; contador >= 0; contador = contador - 2) {
            System.out.printf("%d\n", contador);
        }
    }
}
