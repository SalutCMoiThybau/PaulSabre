package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonPref, int argent, String clan, int reputation) {
		super(nom, boissonPref, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		int argentVole;
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("J’ai piqué les " + argentVole + " sous de Marco, ce qui me fait 45 sous dans ma poche. Hi ! Hi !");
		reputation++;
	}

}
