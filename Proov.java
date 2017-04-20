public class Proov{
	public static void main(String[] arg){
		Toiduaine t1=new Toiduaine("kartul", 0.2, 10, 70);
		Toidukomponendid k1=new Toidukomponendid();
		k1.kogus=100;
		k1.t=t1;
		System.out.println(k1.rasvakogus());
	}
}