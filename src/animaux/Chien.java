package animaux;

import action.Criant;

public class Chien extends Animal implements Criant {
	protected Chien(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void crier() {
		System.out.println("le chien aboye fort");
	}
}
