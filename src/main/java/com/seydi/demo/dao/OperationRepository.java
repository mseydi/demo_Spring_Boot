package com.seydi.demo.dao;


import com.seydi.demo.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface OperationRepository extends JpaRepository<Operation, Long> {

    @Query("select o from Operation o where o.compte.id like :x order by o.dateOperation desc")
            public Page<Operation> listOperation(@Param("x") String id, Pageable page);


}
