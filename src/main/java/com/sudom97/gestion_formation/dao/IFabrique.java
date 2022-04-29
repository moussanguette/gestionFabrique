package com.sudom97.gestion_formation.dao;

import com.sudom97.gestion_formation.entities.Fabrique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface IFabrique extends JpaRepository<Fabrique, Integer> {

    @Query("select paramettre from Fabrique paramettre where paramettre.id=:id")
    public List<Fabrique> getAllFabriqueById(@Param("id") int id);

    @Query("select i from Fabrique i join Formation e where e.id = :id")
    public List<Fabrique> getAllFabriqueFormationById(@Param("id") int id);

}
