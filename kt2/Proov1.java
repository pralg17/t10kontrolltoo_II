public class Proov1{
	public static void main(String[] arg){
		Toiduaine t1=new Toiduaine("Kartul", 20, 10, 70);
		Toiduaine t2=new Toiduaine("Hapukoor", 30, 30, 40);
		Toidukomponendid k2=new Toidukomponendid();
		Toidukomponendid k1=new Toidukomponendid();
		k1.kogus=100;
		k2.kogus=30;
		k2.t=t2;
		k1.t=t1;
		System.out.println(k1.rasvakogus());
		System.out.println(k2.rasvakogus());
	}
}