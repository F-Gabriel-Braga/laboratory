package classes_e_metodos;

public class ValorVsReferencia {
    public static void main(String[] args) {

        // Atribuição por valor
        double a = 2;
        double b = a;
        System.out.println("a " + ++a);
        System.out.println("b " + --b);

        // Atribuição por referência
        Data d1 = new Data("01", "Junho", "2022");
        Data d2 = d1;
        d1.dia = "31";
        d2.mes = "Dezembro";
        d1.ano = "2021";

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = "01";
        d.mes = "Janeiro";
        d.ano = "1970";
    }
}
