package personnages;

public class Commercant extends Humain{
	private int argentPerdu;

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	
	public int seFaireExtorquer() {
		argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		parler("J’ai tout perdu ! Le monde est trop injuste...");
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}

}
