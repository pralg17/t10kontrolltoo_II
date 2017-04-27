public class Proov{
	public static void main(String[] arg){
		Toiduained t1=new Toiduained("viiner", 46, 13, 32);
		Toiduained t2=new Toiduained("vorst", 20, 32, 40);
		Toidukomp k2=new Toidukomp();
		Toidukomp k1=new Toidukomp();
		k1.kogus=300;
		k2.kogus=30;
		k2.t=t2;
		k1.t=t1;
		System.out.println("Sinu toode "+t1.nimetus+" sisaldab "+k1.rasvakogus()+" Grammi rasva");
		System.out.println("Sinu toode "+t2.nimetus+" sisaldab "+k2.rasvakogus()+" Grammi rasva");
	}
}
