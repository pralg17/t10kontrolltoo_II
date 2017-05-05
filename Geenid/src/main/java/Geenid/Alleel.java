package Geenid;

public class Alleel{
	String nimi;
	boolean onPositiivne;

	public Alleel(String nimi, boolean onPositiivne){
	this.nimi = nimi;
	this.onPositiivne = onPositiivne;
	}

	public String votanimetus(){
	return nimi;
	}
	public boolean kasonpositiivne(){
	return onPositiivne;
	}
}

