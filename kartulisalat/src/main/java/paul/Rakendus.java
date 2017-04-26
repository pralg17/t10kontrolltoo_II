public class Rakendus{
	
	public static void main(String[] arg){
		
		Toiduaine t1=new Toiduaine("Kartul", 3, 8, 11);
		Toidukomponendid t2=new Toidukomponendid();
		t2.kogus=100;
		t2.t=t1;
		System.out.println("Kartulis on rasva: "+t2.rasvakogus()+"g");	

		Toiduaine t3=new Toiduaine("Vorst", 10, 14, 5);
		Toidukomponendid t4=new Toidukomponendid();
		t4.kogus=50;
		t4.t=t3;
		System.out.println("Vorstis on rasva: "+t4.rasvakogus()+"g");	


	}
	
}

// Kartulis on rasva: 8.0g
// Vorstis on rasva: 7.0g