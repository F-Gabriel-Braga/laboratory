package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        // Calcular valor da expressão aritmética informada na aula
        int diferenca1 = ((int) Math.pow((6 * (3 + 2)), 2)) / (3 * 2);
        int diferenca2 = (int) Math.pow((((1 - 5) * (2 - 7)) / 2), 2);
        int razao1 = (int) Math.pow((diferenca1 - diferenca2), 3);
        int razao2 = (int) Math.pow(10, 3);
        int resultado = razao1 / razao2;
        System.out.println(resultado);
    }
}
