package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStreams {

    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        Stream<String> langs = Stream.of("Java", "Lua", "JavaScript\n");

        langs.forEach(print);

        String[] langs2 = {"PHP", "C#", "Python\n"};

        Stream.of(langs2).forEach(print);

        Arrays.stream(langs2).forEach(print);

        List<String> langs3 = Arrays.asList("Lisp", "Kotlin", "TypeScript\n");
        langs3.stream().forEach(print);
        langs3.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, nome -> (nome+1)).forEach(System.out::println);

    }
}
