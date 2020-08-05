package com.seydi.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Operation {
    @Id
    @GeneratedValue
    private int numOperation;
    private Date dateOperation;
    private double montant;

    @ManyToOne
    @JoinColumn(name="ID")
    private Compte compte;
    public Operation(){}
    public Operation(int numOperation, Date dateOperation, double montant, Compte compte) {
        super();
        this.numOperation = numOperation;
        this.dateOperation = dateOperation;
        this.montant = montant;
        this.compte = compte;
    }

}
