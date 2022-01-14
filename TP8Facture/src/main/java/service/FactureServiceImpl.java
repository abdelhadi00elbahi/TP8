package service;

import dao.FactureDao;
import model.Facture;

public class FactureServiceImpl implements FactureService{
    FactureDao Dao;
    public Facture save(Facture F) {

             return  Dao.save(F);
    }

    public FactureDao getDao() {
        return Dao;
    }

    public void setDao(FactureDao dao) {
        Dao = dao;
    }

    public Facture modify(Facture F) {
        return Dao.update(F);
    }

    @Override
    public void removeById(long id) {
        Dao.deleteById(id);

    }
    public Facture getById(long id) {
        return Dao.findById(id);
    }
}
