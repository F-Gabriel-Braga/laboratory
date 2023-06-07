package estruturas_de_controle;

public class DesafioFor {
    public static void main(String[] args) {
        // Imprimir uma escada de cerquilhas sem usar valores númericos
        for(String valor = "#"; !valor.equals("######"); valor += "#") {
            System.out.println(valor);
        }
    }
}
