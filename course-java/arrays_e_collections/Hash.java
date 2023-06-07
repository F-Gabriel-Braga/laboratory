package arrays_e_collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Gabriel"));
        usuarios.add(new Usuario("Estafene"));

        boolean resultado = usuarios.contains(new Usuario("Ana"));
        System.out.println(resultado);
    }
}
