package fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;
        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = tv50 || tv32;
        boolean saudavel = !sorvete;

        System.out.println("Trabalho na terça: " + trabalho1);
        System.out.println("Trabalho na quinta: " + trabalho2);
        System.out.println("Tomar sorvete: " + sorvete);
        System.out.println("Mais saudável: " + saudavel);
        System.out.println("Ficar em casa: " + saudavel);
        System.out.println("Ficar com fome: " + saudavel);
        System.out.println("Tv 50\": " + tv50);
        System.out.println("Tv 32\": " + tv32);
    }
}
