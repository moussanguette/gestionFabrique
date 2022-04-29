package com.sudom97.gestion_formation.dao;

import com.sudom97.gestion_formation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFormation extends JpaRepository<Formation, Integer> {
    @Query("select paramettre from Formation paramettre where paramettre.id=:id")
    public List<Formation> getAllFormationById(@Param("id") int id);

}