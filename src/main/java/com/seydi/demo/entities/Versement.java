package com.seydi.demo.entities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Versement extends Operation{

    public Versement() {
        super();
    }
    public Versement(int numOperation, Date dateOperation, double montant, Compte compte) {
        super(numOperation,dateOperation, montant, compte);
    }

}
