package stream_API.desafio_map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        UnaryOperator<String> inverter = s -> {
            String revertida = "";
            for(int i = s.length()-1; i >= 0; i--) {
                revertida += (s.charAt(i) + "");
            }
            return revertida;
        };

        inverter = s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> toStringBinary = s -> Integer.parseInt(s, 2); //Converte de String para Inteiro Binario

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.stream().map(Integer::toBinaryString).map(inverter).map(toStringBinary).forEach(System.out::println);

        Consumer<String> print = System.out::println;

        print.accept(inverter.apply("GABRIEL"));

        /*
        * 1. Número para String binária... 6 => "110"
        * 2. Reverter a String... "110" => "011"
        * 3. Converter de volta para inteiro... "011" => 3
        * */
    }
}
