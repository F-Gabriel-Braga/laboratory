package arrays_e_collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        // Inclui um elemento no mapa e substitui um elemento existente
        usuarios.put(1, "Roberta");
        usuarios.put(20, "Estefane");
        usuarios.put(3, "Rebeca");
        usuarios.put(40, "Rafaela");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(20));
        System.out.println(usuarios.remove(/*chave*/40));
        // System.out.println(usuarios.remove(40, "Nome"));

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey() + " -> " +registro.getValue());
        }
    }
}
