package stream_API.map;

import java.util.function.UnaryOperator;

public interface Utilitarios {
    public final static UnaryOperator<String> maiscula = element -> element.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = element -> element.charAt(0) + "";
    public static String grito(String element) {
        return element + "!!!!";
    }
}
