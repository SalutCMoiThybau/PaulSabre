package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];

	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	
	protected void parler(String texte) {
		System.out.println(nom + " - " +texte);
	}	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPref + ".");
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + boissonPref + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (argent>=prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance>=30) {
			for (int i = 0; i < nbConnaissance-1; i++) {
				memoire[i] = memoire[i+1];
			}
			nbConnaissance--;
		}
		memoire[nbConnaissance] = humain;
		nbConnaissance++;
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void listerConnaissance() {
		System.out.printf("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			System.out.printf(memoire[i].getNom() +  ", ");
		}
		System.out.println();
	}

}
