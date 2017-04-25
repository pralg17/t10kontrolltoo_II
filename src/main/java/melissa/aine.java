package melissa;

public class aine{
	String nimetus;
	double molekulmass;
	public aine(String nimetus, double molekulmass){
		if(nimetus==null || nimetus.length()==0){
			throw new RuntimeException("Nimetus puudub");
		}
		this.nimetus=nimetus; 
		this.molekulmass=molekulmass;
	}
	public aine(String nimetus, double molekulmass){
		this(nimetus, molekulmass);
	}
}