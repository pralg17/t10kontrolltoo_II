package Stivo;

public class Kolmkola{
	int pohitoon, suurTerts, kvint;
	
	public Kolmkola(int pohitoon){
		this.pohitoon = pohitoon;
	}
	public int pohitoon(){
		return pohitoon;
	}
	
	public int suurTerts(){
		return pohitoon+4;
	}
	
	public int kvint(){
		return pohitoon+7;
	}
	public String kolmkolaNoodid(){
		String noodid = pohitoon() +" "+ suurTerts() +" "+ kvint();
		return noodid;
	}
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar