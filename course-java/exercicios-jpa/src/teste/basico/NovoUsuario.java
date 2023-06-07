package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Tatiane", "tatiane@email.com");

        em.getTransaction().begin();
        em.persist(novoUsuario); // inserir objeto usuário no banco de dados
        em.getTransaction().commit();
        System.out.println("Id: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
