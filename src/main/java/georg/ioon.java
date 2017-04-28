package georg;

public class ioon {
	
	String nimetus;
	double aatommass;
	double laeng;
	
	public ioon(String nimetus, double aatommass, double laeng){
	
		if(nimetus==null || nimetus.length()==0){
			throw new RuntimeException ("Nimetus puudub");
		}
	
		this.nimetus=nimetus;
		this.aatommass=aatommass;
		this.laeng=laeng;
	}
	//public ioon(String nimetus, double aatommass){
	//	this(String nimetus, double aatommass);
	//}
}