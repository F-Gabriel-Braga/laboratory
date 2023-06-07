package classes_e_metodos;

public class Equals {
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.nome = "Pedro Silva";
        user1.email = "pedrosilva@email.com";

        Usuario user2 = new Usuario();
        user2.nome = "Pedro Silva";
        user2.email = "pedrosilva@email.com";

        System.out.println(user1 == user2); // Comparação de endereço de memória
        System.out.println(user1.equals(user2));
    }
}
