package demo.intellij.jpql;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class Repo {

    @PersistenceContext
    private EntityManager em;

    public List<Customer> findAll() {
        return em.createNamedQuery("findCustomer", Customer.class).getResultList();
    }

}
