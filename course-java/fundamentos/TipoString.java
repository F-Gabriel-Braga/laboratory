package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String s = "Olá Pessoal";
        System.out.println("charAt(5): " + s.charAt(5));
        System.out.println("startsWith(Olá): " + s.startsWith("Olá"));
        System.out.println("endsWith(Pessoal): " + s.endsWith("Pessoal"));
        System.out.println("length(): " + s.length());
        System.out.println("equals(olá pessoal): " + s.equals("olá pessoal"));
        System.out.println("equalsIgnoreCase(olá pessoal): " + s.equalsIgnoreCase("olá pessoal"));
        System.out.println("substring(2, 9): " + s.substring(2, 9));
        System.out.printf("%s Pessoal%s\n", "Olá", "!!!!!!!");
    }
}
