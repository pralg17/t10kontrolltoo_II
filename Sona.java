package brigitta;
public class Sona implements Liides{
	String sona;
	public Sona(String s){
		sona=s;
	}
  public int T2heesinemine(char taht){
	int mitu_korda = 0;
  for(int mitmes_taht = 0; mitmes_taht  < sona.length(); mitmes_taht++){
	  if(sona.charAt(mitmes_taht) == taht){
		  mitu_korda += 1;
		  }
	 }
	 return mitu_korda;
}

}