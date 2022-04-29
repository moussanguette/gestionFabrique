package com.sudom97.gestion_formation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Fabrique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200)
    private String nom;
    @Column(length = 200)
    private String localisation;
    private int nbreSalle ;
    private boolean ouverte ;

    //@ManyToMany
   // private List<Fabrique> enfants = new ArrayList<>();
}
