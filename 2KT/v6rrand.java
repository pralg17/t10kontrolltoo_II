import java.util.concurrent.ThreadLocalRandom;

class v6rrand {
	
	int xKordaja;
	
	double y;
	
	
	
	v6rrand() {

		// genereeritakse random X-i kordaja vahemikus 2 - 5
		xKordaja = ThreadLocalRandom.current().nextInt(2, 5 + 1);
		
	}
	public double arvuta(double x){
		y = x*xKordaja;
		return y;
	}
	
	//v6rrand y=3x
	public double arvuta2(double x){
		y = x*3;
		return y;
	}
	
}

