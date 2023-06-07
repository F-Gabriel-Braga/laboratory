package modelo.composicao;

import estrutura.Entidade;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
public class Funcionario implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "func_id")
    private Long id;

    @Column(name = "func_nome")
    private String nome;

    @Column(name = "fornec_endereco")
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
