package classes_e_metodos;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        if(objeto instanceof Usuario) {
            boolean nome = (this.nome.equals(((Usuario) objeto).nome));
            boolean email = (this.email.equals(((Usuario) objeto).email));
            return (nome && email);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
