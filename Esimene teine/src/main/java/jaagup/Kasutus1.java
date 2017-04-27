package jaagup;




public class Kasutus1{
	
	

	public static double[] massiiv(double[]iksid,Joon klass){
		int pikkus = iksid.length;
		double[]igrekid=new double[pikkus];
		
		for(int i=0;i<pikkus;i++){
			igrekid[i]=klass.leiaY(iksid[i]);
		}
		
		return igrekid;
	}
	
	
		
	public static void main (String[] args){
		
		JoonAction yks = new JoonAction (4);
		JoonAction2 kaks = new JoonAction2(3, 5);
			
		System.out.println(yks.leiaY(4));
		System.out.println(kaks.leiaY(7));
		
		double[] iksid = {3.0,4.0,5.0};
		double[] igrekid = massiiv(iksid,kaks);
		
		for(int i=0;i<igrekid.length;i++){
			System.out.println(igrekid[i]);
		}
		
	}
	
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/testimine-1.jar