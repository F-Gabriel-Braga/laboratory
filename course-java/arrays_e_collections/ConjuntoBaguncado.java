package arrays_e_collections;

import java.util.HashSet;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // Converter para Double
        conjunto.add(true); // Converter para Boolean
        conjunto.add("Teste");
        conjunto.add(87); // Converter para Integer
        conjunto.add('x'); // Converter para Caracter
        System.out.println(conjunto);
        System.out.println(conjunto.size());
        conjunto.remove("Teste");
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains('x'));
        HashSet nuns = new HashSet();
        nuns.add(1);
        nuns.add(2);
        nuns.add(3);
        System.out.println(nuns);
        conjunto.addAll(nuns);
        System.out.println(conjunto);
        nuns.add(87);
        conjunto.retainAll(nuns);
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);
    }
}
