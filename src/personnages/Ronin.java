package personnages;

public class Ronin extends Humain{
	private int honneur;

	public Ronin(String nom, String boissonPref, int argent, int honneur) {
		super(nom, boissonPref, argent);
		this.honneur = honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		int donArgent = getArgent()/10;
		
		if (donArgent > 0) {
			parler(beneficiaire.getNom() + " prend ces 6 sous.");
			perdreArgent(getArgent() - donArgent);
			beneficiaire.recevoir(donArgent);
		} else {
			parler("Je n'ai pas assez d'argent pour t'en donner.");
		}
	}

}
