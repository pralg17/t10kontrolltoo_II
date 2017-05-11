package martin;

public class IoonMass implements Aine{
	public String nimetus(){
		return nimetus;
	}
	public int molekulmass(){
		return molekulmass;
	}

	String nimetus;
	int molekulmass;
	
	public IoonMass(String nimetus, int molekulmass){
		this.nimetus=nimetus;
		this.molekulmass=molekulmass;
	}
}