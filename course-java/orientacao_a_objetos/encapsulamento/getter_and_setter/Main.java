package orientacao_a_objetos.encapsulamento.getter_and_setter;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gabriel", 19);
        pessoa1.setIdade(-45);
        //pessoa1.setIdade(30);
        pessoa1.setIdade(-3);
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1); // To String
    }
}
