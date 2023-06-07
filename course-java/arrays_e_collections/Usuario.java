package arrays_e_collections;

import java.util.Objects;

public class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Usuario) {
            Usuario user = (Usuario) o;
            if(this.nome.equals(user.nome)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
}
