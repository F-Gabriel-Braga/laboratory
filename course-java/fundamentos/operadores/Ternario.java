package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 5.6;
        // Condição ? (Valor caso True) : (Valor caso False);
        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
