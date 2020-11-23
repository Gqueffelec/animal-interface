package animaux;

import action.Nageur;

public class Sardine extends Animal implements Nageur {

	public Sardine(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void nage() {
		System.out.println(this.nom + " nage dans l'eau");
	}

	public void mangePlancton() {
		System.out.println(this.nom + " mange du plancton");
	}

}
