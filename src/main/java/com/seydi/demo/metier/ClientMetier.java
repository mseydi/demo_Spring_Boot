package com.seydi.demo.metier;

import com.seydi.demo.dao.CompteRepository;
import com.seydi.demo.dao.OperationRepository;
import com.seydi.demo.dao.TitulaireRepository;
import com.seydi.demo.entities.Compte;
import com.seydi.demo.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientMetier {
    @Autowired
    TitulaireRepository titulaireRepository;
    @Autowired
    CompteRepository compteRepository;
    @Autowired
    OperationRepository operationRepository;


    public List<Operation> allOperation(){
        return operationRepository.findAll();
    }
}
