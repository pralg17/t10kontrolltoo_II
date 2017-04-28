package mart;

public class Alleel{
	public String nimi;
	public Boolean positiivne;
	
	public Alleel(String nimi, boolean positiivne){
		this.nimi = nimi;
		this.positiivne = positiivne;
	}

	public String getNimi(){
		return nimi;
	}

	public boolean onPositiivne(){
		return positiivne;
	}
}