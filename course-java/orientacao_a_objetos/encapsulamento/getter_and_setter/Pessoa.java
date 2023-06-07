package orientacao_a_objetos.encapsulamento.getter_and_setter;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    // Getter
    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    // Setter
    public void setIdade(int idade) {
        // Validação de idade
        if((idade >= 0) && (idade <= 130)) {
            this.idade = idade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
