package modelo.muitosparamuitos;

import estrutura.Entidade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "filmes")
public class Filme implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Long id;

    @Column(name = "filme_nome")
    private String nome;

    @Column(name = "film_nota")
    private Double nota;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "atores_filmes",
            joinColumns = @JoinColumn(
                    name = "film_id",
                    referencedColumnName = "film_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "ator_id",
                    referencedColumnName = "ator_id"
            )
    )
    private List<Ator> atores = new ArrayList<>();

    public Filme() {
    }

    public Filme(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        if(atores == null)
            atores = new ArrayList<>();
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public void adicionarAtor(Ator ator) {
        if(ator != null && !getAtores().contains(ator)) {
            getAtores().add(ator);
            if(!ator.getFilmes().contains(this))
                ator.getFilmes().add(this);
        }
    }
}
