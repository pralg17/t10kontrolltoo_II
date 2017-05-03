public class Proov1{
	
	public static void main(String[] arg){
		
		Toiduaine t1 = new Toiduaine("Kartul", 8.0, 1.0, 91.0);
		Toiduaine t2 = new Toiduaine("Hapukoor", 2.7, 20.0, 77.3);
		
		Toidukomponent k1 = new Toidukomponent();
		k1.t = t1;
		k1.kogus = 100.0;	//Grammides
		
		Toidukomponent k2 = new Toidukomponent();
		k2.t = t2;
		k2.kogus = 30.0;    //Grammides
		
		Toit toit1 = new Toit("Salat", k1);
		
		System.out.println(k1.rasvakogus());
		System.out.println(k2.rasvakogus());
		System.out.println(toit1.valkudekogus);
		
	}
	
	
}