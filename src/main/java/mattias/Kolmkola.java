package mattias;;

public class Kolmkola{
	
	//Mazoorkolmkõla nootide arvutamine
	
	int pohitoon;
	
	public Kolmkola(int pohitoon){
		this.pohitoon = pohitoon;
	}
	
	public String vastus(){
		int suurterts = pohitoon + 4;
		int kvint = pohitoon + 7;
		
		return String.valueOf(pohitoon) + " " + String.valueOf(suurterts) + " " + String.valueOf(kvint);
	}
	
	/*
	public int vastusKvint(){
		int kvint = pohitoon + 7;
		return kvint;
	}
	*/
	
}