package modelo.umparaum;

import estrutura.Entidade;

import javax.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assent_id")
    private Long id;

    @Column(name = "assent_nome")
    private String nome;

    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Assento() {
    }

    public Assento(String nome) {
        this.nome = nome;
    }

    public Assento(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
