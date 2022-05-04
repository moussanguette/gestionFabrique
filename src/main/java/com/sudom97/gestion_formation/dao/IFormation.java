package com.sudom97.gestion_formation.dao;

import com.sudom97.gestion_formation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFormation extends JpaRepository<Formation, Integer> {
    @Query("select formationData from Formation formationData where formationData.id=:id") // recuperation de la liste des formations dans la BD
    public List<Formation> getAllFormationById(@Param("id") int id);

}