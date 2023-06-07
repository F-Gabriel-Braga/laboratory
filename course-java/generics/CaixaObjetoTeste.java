package generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // double -> Objeto

        Double coisaA = (Double) caixaA.abrir();
        System.out.println(coisaA);
        CaixaObjeto caixaB = new CaixaObjeto();
        caixaA.guardar("Olá!");

        String coisaB = (String) caixaA.abrir();
        System.out.println(coisaB);
    }
}
