package animaux;

import action.Criant;
import action.Marcheur;

public class Chat extends Animal implements Criant, Marcheur {

	protected Chat(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void crier() {
		System.out.println("le chat miaule fort");
	}

	public void marche() {
		System.out.println(this.nom + " marche avec ses quatres pattes");
	}

}
