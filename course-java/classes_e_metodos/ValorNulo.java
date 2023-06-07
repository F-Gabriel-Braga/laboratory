package classes_e_metodos;

public class ValorNulo {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!!!!!!!"));

        String s2 = null; // NullPointerException
        System.out.println(s2.concat("!!!!!!!!!"));

        Data d1 = null;
        // d1.mes = "3"; // NullPointerException
        if(d1 != null) {
            d1.mes = "3";
        }
    }
}
