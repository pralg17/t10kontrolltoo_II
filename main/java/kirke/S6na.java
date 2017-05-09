package kirke;
public class S6na implements T2ht{
	String s6na;
	public S6na(String s){
		s6na=s;
	}
  public int T2heesinemine(char t2ht){
	int mitu_korda = 0;
  for(int mitmes_t2ht = 0; mitmes_t2ht  < s6na.length(); mitmes_t2ht++){
	  if(s6na.charAt(mitmes_t2ht) == t2ht){
		  mitu_korda += 1;
		  }
	 }
	 return mitu_korda;
}

}
