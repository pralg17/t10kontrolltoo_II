package alari;

public class Vorrand implements Funktsioon{
	String x;
	public Vorrand(String x){
		this.x=x;
	}
	public int f(int kordaja){
		return kordaja*Integer.parseInt(x);
	}
}
