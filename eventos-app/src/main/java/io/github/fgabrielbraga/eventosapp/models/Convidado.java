package io.github.fgabrielbraga.eventosapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotBlank
    private String cpf;

    @NotBlank
    private String nome;

    @ManyToOne
    private Evento evento;

    public Convidado() {
    }

    public Convidado(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
