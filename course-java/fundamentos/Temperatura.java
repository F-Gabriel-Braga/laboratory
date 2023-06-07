package fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        final double diferenca = 32;
        final double produto = 5.0/9.0;
        double temperatura_celsius;
        double temperatura_fahrenheit;

        System.out.println("Digite a temperatura em celsius:");
        temperatura_fahrenheit = Double.parseDouble(new Scanner(System.in).nextLine());
        temperatura_celsius = (temperatura_fahrenheit - diferenca) * produto;
        System.out.println("Temperatura em celsius: " + temperatura_celsius + "°C");
    }
}
