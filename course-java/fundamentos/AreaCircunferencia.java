package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        // Constante
        final double pi = 3.14159;
        // Variáveis
        double raio = 3;
        double area = pi * raio * raio;
        System.out.println("Area: " + area);

        raio = 10;
        area = pi * raio * raio;
        System.out.println("Area: " + area);
    }
}
/*
* Constantes são valores fixos que você utilizará em seu programa.
* Variáveis são valores que precisam variar durante o tempo de execução do seu programa.
* */
