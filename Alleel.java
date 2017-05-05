package baas;

public class Alleel{
	public String nimetus;
	public boolean positiivne;

	public Alleel(String nimetus, boolean positiivne){
		this.nimetus = nimetus;
		this.positiivne = positiivne;
	}

	public String getNimetus(){
		return nimetus;
	}

	public boolean isPositiivne(){
		return positiivne;
	}
    

}
