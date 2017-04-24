public class Proov1{
	
	public static void main(String[] arg){
		
		Toiduained t1=new Toiduained("Kartul", 5, 10, 15);
		Toidukomponendid t2=new Toidukomponendid();
		t2.kogus=100;
		t2.t=t1;
		System.out.println(t2.rasvakogus());
	}
	
}