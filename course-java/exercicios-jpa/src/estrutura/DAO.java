package estrutura;

import javax.persistence.*;
import java.util.List;

public class DAO<E extends Entidade> {

    private static EntityManagerFactory emf;
    private static EntityManager em;
    private Class<E> classe;

    static  {
        try {
            emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO<E> abrirTransacao() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharTransacao() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade) {
        return this.abrirTransacao().incluir(entidade).fecharTransacao();
    }

    public List<E>  obterTodos(int qtde, int deslocamento) {
        if(classe == null) {
            throw new UnsupportedOperationException("Classe nula.");
        }
        String jpql = String.format("select e from %s e", classe.getName());
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(qtde);
        query.setFirstResult(deslocamento);

        return query.getResultList();
    }

    public List<E>  obterTodos() {
        return obterTodos(10, 0);
    }

    public E obterPorId(Object id) {
        return em.find(classe, id);
    }

    public List<E> consultar(String nomeConsulta, Object... params) {
        TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
        for (int i = 0; i < params.length; i += 2)
            query.setParameter(params[i].toString(), params[i+1]);
        return query.getResultList();
    }

    public E consultarUm(String nomeConsulta, Object... params) {
        List<E> lista = consultar(nomeConsulta, params);
        return lista.isEmpty() ? null : lista.get(0);
    }

    public void fechar() {
        em.close();
        emf.close();
    }
}
