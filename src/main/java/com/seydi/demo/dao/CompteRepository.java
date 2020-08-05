package com.seydi.demo.dao;

import com.seydi.demo.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompteRepository extends JpaRepository<Compte, Long> {


}
