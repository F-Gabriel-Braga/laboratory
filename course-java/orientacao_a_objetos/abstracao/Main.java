package orientacao_a_objetos.abstracao;

public class Main {
    public static void main(String[] args) {
        Animal cachorro1 = new Cachorro(); // No nivel de animal o cachorro n tem o metodo mamar
        System.out.println(cachorro1.respirar());
        // System.out.println(cachorro.mamar());
        Mamifero cachorro2 = new Cachorro();
        System.out.println(cachorro2.respirar());
        System.out.println(cachorro2.mamar());
    }
}
