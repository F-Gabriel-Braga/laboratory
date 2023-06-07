package modelo.consulta;

import estrutura.Entidade;

public class NotaFilme implements Entidade {

    private Double media;

    public NotaFilme(Double media) {
        this.media = media;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}
