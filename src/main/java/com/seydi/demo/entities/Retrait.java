package com.seydi.demo.entities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Retrait extends Operation{
    public Retrait() {

        super();
    }
    public Retrait(int numOperation, Date dateOperation, double montant, Compte compte) {
        super( numOperation, dateOperation, montant, compte);
    }
}
