package modelo.composicao;

import estrutura.Entidade;

import javax.persistence.*;

@Embeddable
public class Endereco implements Entidade {

    private String logradouro;
    private String complemento;

    public Endereco() {
    }

    public Endereco(String logradouro, String complemento) {
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
