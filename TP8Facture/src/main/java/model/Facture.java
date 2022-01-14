package model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Getter
@Setter
@Entity

public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id ;
    Date date ;
    double amount;

    public Facture(String aa) {
    }

    public Facture(long id, Date date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }




    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
