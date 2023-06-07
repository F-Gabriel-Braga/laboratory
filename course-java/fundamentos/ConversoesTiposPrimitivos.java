package fundamentos;

public class ConversoesTiposPrimitivos {
    public static void main(String[] args) {
        double a = 1.123456789101121;
        System.out.println(a);

        float b = (float) 1.123456789101121314;
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.999999; // Conversão Implícita
        System.out.println(e);
        int f = (int) e; // Conversão Explícita
        System.out.println(f);
    }
}