package animaux;

import action.Criant;
import action.Marcheur;

public class Chien extends Animal implements Criant, Marcheur {
	protected Chien(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void crier() {
		System.out.println("le chien aboye fort");
	}

	public void marche() {
		System.out.println(this.nom + " marche avec ses quatres pattes");
	}

	public void enterreUnOs() {
		System.out.println(this.nom + " enterre un os");
	}
}
