package stream_API;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Bia", "Ana", "Gui", "Luca");

        System.out.println("FOR");
        for(int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        System.out.println("\nFOREACH");
        for (String aprovado: aprovados) {
            System.out.println(aprovado);
        }

        System.out.println("\nITERATOR");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nSTREAM 1");
        Stream<String> stream1 = aprovados.stream();
        stream1.forEach(System.out::println); // Laço interno

        System.out.println("\nSTREAM 2");
        Stream<String> stream2 = aprovados.stream();
        stream2.forEach(value -> System.out.println(value));
    }
}
