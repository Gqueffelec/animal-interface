package main;

import java.util.ArrayList;
import java.util.List;

import animaux.Animal;
import animaux.Chat;
import animaux.Chien;
import animaux.Sardine;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> listeAnimaux = new ArrayList<Animal>();
		listeAnimaux.add(new Chat("Orion"));
		listeAnimaux.add(new Chat("Ragnar"));
		listeAnimaux.add(new Chien("Medor"));
		listeAnimaux.add(new Chien("Kiki"));
		listeAnimaux.add(new Chien("Lassie"));
		listeAnimaux.add(new Sardine("Nemo"));
		listeAnimaux.add(new Sardine("Dory"));
		for (Animal animal : listeAnimaux) {
			animal.respire();
			if (animal instanceof Chat) {
				((Chat) animal).marche();
				((Chat) animal).joueAvecPelotteDeLaine();
			} else if (animal instanceof Chien) {
				((Chien) animal).marche();
				((Chien) animal).enterreUnOs();
			} else if (animal instanceof Sardine) {
				((Sardine) animal).nage();
				((Sardine) animal).mangePlancton();
			}
		}

	}
}
