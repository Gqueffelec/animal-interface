package animaux;

import action.Nageur;

public class Sardine extends Animal implements Nageur {

	protected Sardine(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void nage() {
		System.out.println(this.nom + "nage dans l'eau");
	}

}
