package com.seydi.demo.metier;

import com.seydi.demo.entities.Compte;
import com.seydi.demo.entities.Operation;
import com.seydi.demo.entities.Titulaire;
import org.springframework.data.domain.Page;

public interface IBanqueMetier {
    public Compte consulterCompte(String codeCte);
    public void depot(String codeCte,double montant);
    public void retirer(String codeCte,double montant);
    public Page<Operation> listOperation(String codeCte,int page,int size);
}
