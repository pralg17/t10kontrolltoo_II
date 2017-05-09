public class Hulknurk2{
	double n, a;
	public Hulknurk2(int arv, double pikkus){
		if(arv<=0){throw new RuntimeException("sobimatu nurkade arv");}
		if(pikkus<=0){throw new RuntimeException("sobimatu pikkus");}
		n=arv;
		a=pikkus;
	}
	public double ymberm66t(){
		return n*a;
	}
	public double pindala(){
		return ymberm66t()/2 * a;
	}
	public String toString(){
		return +n+"nurk, kylgede pikkusega "+a+", ymberm66t "+
				ymberm66t()+"m, pindala "+pindala();
	}
}
