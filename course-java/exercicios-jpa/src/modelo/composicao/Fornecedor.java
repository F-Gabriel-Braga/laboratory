package modelo.composicao;

import estrutura.Entidade;

import javax.persistence.*;

@Entity
@Table(name = "fornecedores")
public class Fornecedor implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fornec_id")
    private Long id;

    @Column(name = "fornec_nome")
    private String nome;

    @Column(name = "fornec_endereco")
    private Endereco endereco;

    public Fornecedor() {
    }

    public Fornecedor(String nome, Endereco endereco) {
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
