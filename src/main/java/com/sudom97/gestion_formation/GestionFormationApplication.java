package com.sudom97.gestion_formation;

import com.sudom97.gestion_formation.dao.IFabrique;
import com.sudom97.gestion_formation.dao.IFormation;
import com.sudom97.gestion_formation.entities.Fabrique;
import com.sudom97.gestion_formation.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionFormationApplication implements CommandLineRunner {

	@Autowired
	private IFabrique fabriquedao;
	@Autowired
	private IFormation formationdao;
	public static void main(String[] args) {
		SpringApplication.run(GestionFormationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

/*
		Fabrique fabrique = new Fabrique();
		fabrique.setNom("volkeno");
		fabriquedao.save(fabrique);
		fabriquedao.findAll().forEach(c->System.out.println(c.getNom()));

		Formation formation = new Formation();
		formation.setLibelle("C#");

		formationdao.save(formation);
		formationdao.findAll().forEach(data->System.out.println(data.getLibelle()));
 */


	}

}
