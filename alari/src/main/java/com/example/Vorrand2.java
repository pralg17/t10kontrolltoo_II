
public class Vorrand2 implements Funktsioon{
	int x;
	int a;
	public Vorrand2(int x, int a){
		this.x = x;
		this.a = a;
	}
	public int f(int kordaja){
		return kordaja*x+a;
	}

}
