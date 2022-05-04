package com.sudom97.gestion_formation.services;

import com.sudom97.gestion_formation.dao.IFabrique;
import com.sudom97.gestion_formation.entities.Fabrique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class fabriqueService {
   @Autowired
    private IFabrique fabriquedao;

   // liste des fabriques
   @RequestMapping(value = "/fabrique", method = RequestMethod.GET)
    public List<Fabrique> getAll(){
       return fabriquedao.findAll();
   }

   // recuperation d'une fabrique
   @RequestMapping(value = "/fabrique/{id}", method = RequestMethod.GET)
   public List<Fabrique> getAllFabriqueById(@PathVariable int id){
       return fabriquedao.getAllFabriqueById(id);
   }
    @RequestMapping(value = "/fabrique/{id}/formation", method = RequestMethod.GET)
    public List<Fabrique> getAllFabriqueFormationById(@PathVariable int id){
        return fabriquedao.getAllFabriqueFormationById(id);
    }

   // insertion d'une nouvelle fabrique
    /*
   @RequestMapping(value = "/fabrique/ajouter", method = RequestMethod.POST)
   public int save(Fabrique fabrique){
       fabriquedao.save(fabrique);
       return 1;
   }

     */
}
