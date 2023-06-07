package stream_API.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");

        marcas.stream().map(e -> e.toUpperCase()).forEach(print);

        //UnaryOperator<String> maiscula = element -> element.toUpperCase();
        //UnaryOperator<String> primeiraLetra = element -> element.charAt(0) + "";
        //UnaryOperator<String> grito = element -> element + "!!!!!!!";

        //System.out.println(maiscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

        System.out.println("\nUsando composição...");
        marcas.stream()
                .map(Utilitarios.maiscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
