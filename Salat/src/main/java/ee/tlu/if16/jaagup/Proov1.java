public class Proov1{

	public static void main(String[] arg){
		Toiduaine toiduaine1 = new Toiduaine("Kartul", 15.0, 10.0, 50.0); //toiduaine1 nimetus, valgud-rasvad-süsivesikud (protsent)
		Toiduaine toiduaine2 = new Toiduaine("Hapukoor", 9.7, 50.0, 15.7); //toiduaine2 nimetus, valgud-rasvad-süsivesikud (protsent)
		Toidukomponent komponent1 = new Toidukomponent();
		Toidukomponent komponent2 = new Toidukomponent();
		komponent1.toiduaine = toiduaine1; //Toidu komponent1 võtab Kartuli toiduaineks
		komponent1.kogus = 100.0; // Kartuli koguseks 100 grammi
		komponent2.toiduaine = toiduaine2; //Toidu komponent2 võtab Hapukoore toiduaineks
		komponent2.kogus = 30.0; //Hapukoore  koguseks 30 grammi
		System.out.println(komponent1.rasvakoguse_arvutaja()); //Saadab 100g kartuli koguse ja rasvaprotsendi Toidukomponendi rasvakoguse arvutamisse
		System.out.println(komponent2.rasvakoguse_arvutaja()); //Saadab 30g Hapukoort Toidukomponendi rasvakoguse arvutamisse
	}

}
