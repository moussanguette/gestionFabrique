package com.sudom97.gestion_formation.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 200)
    private String libelle;
    @Column(length = 200)
    private int duree ;
    @Column(length = 200)
    private String prerequis;
    //@Temporal(TemporalType.DATE)
    //private Data date;




}
