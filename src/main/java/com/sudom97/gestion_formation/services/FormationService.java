package com.sudom97.gestion_formation.services;

import com.sudom97.gestion_formation.dao.IFabrique;
import com.sudom97.gestion_formation.dao.IFormation;
import com.sudom97.gestion_formation.entities.Fabrique;
import com.sudom97.gestion_formation.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FormationService {
    @Autowired
    private IFormation formationdao;

    // liste des fabriques
    @RequestMapping(value = "/formation", method = RequestMethod.GET)
    public List<Formation> getAll(){
        return formationdao.findAll();
    }

    // recuperation d'une fabrique
    @RequestMapping(value = "/formation/{id}", method = RequestMethod.GET)
    public List<Formation> getAllFormationById(@PathVariable int id){
        return formationdao.getAllFormationById(id);
    }

    // insertion d'une nouvelle fabrique
    @RequestMapping(value = "/formation/ajouter", method = RequestMethod.POST)
    public int save(Formation formation){
        formationdao.save(formation);
        return 1;
    }
}
