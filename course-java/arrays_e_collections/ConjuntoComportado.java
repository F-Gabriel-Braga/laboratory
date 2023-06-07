package arrays_e_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //SortedSet<String> lista = new TreeSet<>(); // Garante a ordem de inserção
        Set<String> lista = new TreeSet<>(); // Garante a ordem de inserção
        //Set<String> lista = new HashSet<String>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Gabriel");
        lista.add("Luca");
        lista.add("Pedro");

        for(String candidato: lista) {
            System.out.println(candidato);
        }

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);

        for(Integer numero: numeros) {
            System.out.println(numero);
        }
    }
}
