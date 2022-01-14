package dao;

import model.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDaoImpl implements FactureDao {
    EntityManagerFactory emf=
            Persistence.createEntityManagerFactory("unit_Facture");
    EntityManager em=emf.createEntityManager();
    public Facture save (Facture F)
    {
        em.getTransaction().begin();
        em.persist(F);
        em.getTransaction().commit();

        return null ;
    }

    @Override

    public Facture update(Facture newFacture) {
        em.getTransaction().begin();
        Facture currentFacture =
                em.find(Facture.class,newFacture.getId());
        currentFacture.setId(newFacture.getId());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null;
    }


    @Override
    public void deleteById(long idFacture) {

em.getTransaction().begin();
        Facture FactureInDataBase = em.find(Facture.class,idFacture);
em.remove(FactureInDataBase);
em.getTransaction().commit();
}

    @Override
    public Facture findById(long idFacture) {
        return em.find(Facture.class,idFacture);

    }
}
