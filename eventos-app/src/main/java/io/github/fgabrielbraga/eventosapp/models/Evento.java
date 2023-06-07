package io.github.fgabrielbraga.eventosapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String local;

    @NotBlank
    private String data;

    @NotBlank
    private String horario;

    @OneToMany
    private List<Convidado> convidados;

    public Evento() {
    }

    public Evento(String nome, String local, String data, String horario) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.horario = horario;
    }

    public Evento(Long id, String nome, String local, String data, String horario) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.horario = horario;
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

    public void setNome(String name) {
        this.nome = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados) {
        this.convidados = convidados;
    }
}
