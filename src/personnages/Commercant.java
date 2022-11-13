package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	
	public void seFaireExtorquer() { // question : de base le type est int
		perdreArgent(getArgent());
		parler("J’ai tout perdu ! Le monde est trop injuste...");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler("15 sous ! Je te remercie généreux donateur !");
	}

}
