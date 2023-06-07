package arrays_e_collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Luca"));
        usuarios.add(new Usuario("Carlos"));
        usuarios.add(new Usuario("Gabriel"));
        usuarios.add(new Usuario("Manu"));
        usuarios.add(new Usuario("Bia"));

        System.out.println(usuarios.get(3).nome + "\n"); // Obtem pelo indice

        System.out.println(usuarios.remove(1).nome); // Remove pelo indice
        System.out.println(usuarios.remove(new Usuario("Bia"))); // Remove pelo equals
        System.out.print("\n");

        for(Usuario usuario: usuarios) {
            System.out.println(usuario.nome);
        }
        System.out.print("\n");

        System.out.println("Tem? " + usuarios.contains(new Usuario("Ana"))); // Contem pelo equals
    }
}
