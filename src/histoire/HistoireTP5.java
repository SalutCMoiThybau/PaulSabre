package histoire;

import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		
		Commercant marco =  new Commercant("Marco", 20);
		Commercant chonin =  new Commercant("Chonin", 40);
		Commercant kumi =  new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		System.out.println("Le marchand Marco rencontre le ronin.");
		marco.faireConnaissanceAvec(roro);
		
		System.out.println("Le marchand Marco rencontre le yakuza.");
		marco.faireConnaissanceAvec(yaku);
		
		System.out.println("Le marchand Marco rencontre un autre marchand.");
		marco.faireConnaissanceAvec(chonin);
		
		System.out.println("Le marchand Marco rencontre un autre marchand.");
		marco.faireConnaissanceAvec(kumi);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();

	}

}
