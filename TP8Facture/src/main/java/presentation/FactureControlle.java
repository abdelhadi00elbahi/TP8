package presentation;


import model.Facture;
import service.FactureService;

public class FactureControlle {
    FactureService Service ;
    public void save(Facture F) {
        Service.save(F);


    }
    public void modify(Facture F){
        Service.modify(F);
    }
    public void removeById(long id){
        Service.removeById(id);
    }
    public Facture getById(long id){
        return Service.getById(id);
    }

}
