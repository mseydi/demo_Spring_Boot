package com.seydi.demo.metier;

import com.seydi.demo.entities.Compte;
import com.seydi.demo.entities.Titulaire;
import org.springframework.data.domain.Page;

public interface IClientMetier {
    public Titulaire consulterClient(Long codeClt);
    public void supprimerClient(Long codeClt);
    public Titulaire ajouter(Titulaire t);

   // public Page<Compte> listComptes(Long codeClt, int page, int size);
}
