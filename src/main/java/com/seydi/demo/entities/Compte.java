package com.seydi.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Compte {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private double solde;
    private Date dateCreation;
    private boolean etat;
    @ManyToOne
    @JoinColumn(name="id")
    private Titulaire titulaire ;
    @OneToMany(mappedBy="compte")
    private List<Operation> operations;
}
