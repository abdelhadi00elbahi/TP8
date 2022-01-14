package service;

import dao.FactureDao;
import model.Facture;

public interface FactureService {
    public Facture save (Facture F);
    Facture modify(Facture F);
    void removeById(long id);
    Facture getById(long id);
}
