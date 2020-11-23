package animaux;

import action.Criant;

public class Chat extends Animal implements Criant {

	protected Chat(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public void crier() {
		System.out.println("le chat miaule fort");
	}
}
