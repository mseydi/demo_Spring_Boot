package com.seydi.demo.dao;

import com.seydi.demo.entities.Titulaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitulaireRepository extends JpaRepository<Titulaire, Long> {
}
