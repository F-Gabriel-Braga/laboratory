package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L); // objeto está associado
        System.out.println(usuario.getNome());
        usuario.setNome("Gustavo");
        usuario.setEmail("gustavo@email.com");
        //em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
