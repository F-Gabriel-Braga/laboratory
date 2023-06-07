package modelo.muitosparamuitos;

import estrutura.Entidade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sobrinhos")
public class Sobrinho implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "sobrin_id")
    private Long id;

    @Column(name = "sobrin_nome")
    private String nome;

    @ManyToMany(mappedBy = "sobrinhos")
    private List<Tio> tios = new ArrayList<>();

    public Sobrinho() {
    }

    public Sobrinho(String nome) {
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

    public List<Tio> getTios() {
        return tios;
    }

    public void setTios(List<Tio> tios) {
        this.tios = tios;
    }
}
