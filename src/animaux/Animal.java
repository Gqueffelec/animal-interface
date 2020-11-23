package animaux;

public abstract class Animal {
	protected String nom;

	protected Animal(String nom) {
		this.nom = nom;
	}

	public void respire() {
		System.out.println(this.nom + " respire");
	}
}
