package rauntege;

public class Ioon implements Liides{

	String name;
	double mass;
	int charge;

	public Ioon (String name, double mass, int charge){
		this.name = name;
		this.mass = mass;
		this.charge = charge;
	}

	public String getName(){
		return name;
	}
}