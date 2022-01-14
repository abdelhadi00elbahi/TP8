package dao;

import model.Facture;

public interface FactureDao {
    Facture save(Facture F);
    Facture update(Facture F);
    void deleteById(long idFacture);
    Facture findById(long idFacture);
}
