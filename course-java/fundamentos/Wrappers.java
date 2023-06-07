package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        Byte b = 100; // byte
        System.out.println(b);
        Short s = 1000; // short
        System.out.println(s);
        Integer i = 10000; // int
        System.out.println(i);
        Long l = 1000000L; // long
        System.out.println(l);

        Float f = 123.56F;
        System.out.println(f);
        Double d = 4515.0;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true"); // boolean
        System.out.println(bo);
        System.out.println(bo.toString());

        Character c = '#'; // char
        System.out.println(c);
    }
}
// Autoboxing: Primitivo -> Wrapper
// Unboxing: Wrapper -> Primitivo
