import java.util.*;


public class Proov{
	public static void main(String[] args) {
		
		int j;
		double kogupikkus;
		
		ArrayList<Jogi> jogi= new ArrayList<>();
		
		jogi.add(new Jogi("Pirakas", 150, 32, "", 0));
		jogi.add(new Jogi("Keskmik", 88, 15, "Pirakas", 18));
		jogi.add(new Jogi("Pisike", 12, 3, "Keskmik", 67));
		jogi.add(new Jogi("Keskpärane", 57, 12, "Pirakas", 112));
		jogi.add(new Jogi("Nääps", 8, 1, "Pisike", 3));
		
		
		System.out.println("\n");
		
		for(int i=0; i<jogi.size(); i++) {
			if( jogi.get(i).siht == "" ) {
				System.out.println("Jõe '" + jogi.get(i).nim +  "' pikkus on " + jogi.get(i).pikk + "km ja see suubub otse merre");
			} else {
				System.out.println("Jõe '" + jogi.get(i).nim +  "' pikkus on " + jogi.get(i).pikk + "km ja see suubub merre läbi jõgede: ");

				j=i;
				kogupikkus = jogi.get(i).pikk + jogi.get(i).suubum;
				while (jogi.get(j).siht != "") {
					System.out.println(jogi.get(j).siht);
					
					for(int k=0; k<jogi.size(); k++) {
						if (jogi.get(k).nim == jogi.get(j).siht) {
							j=k;
							kogupikkus += jogi.get(k).suubum;
						}
					}
					
				}
				
				System.out.println("mis teeb kogupikkuseks " + kogupikkus + "km.");
			}
			System.out.println();
		}
		
		System.out.println("\n");

		
	}
}
