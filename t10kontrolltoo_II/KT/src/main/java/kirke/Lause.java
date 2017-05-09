package kirke;
public class Lause implements T2ht{
	String Lause;
	S6na[] m;
	public Lause(String s){
		Lause=s;
		String[] abi=s.split(" ");
		m = new S6na[abi.length];
		for(int i = 0; i < abi.length; i++){
			m[i] = new S6na(abi[i]);
		}
	}
  public int T2heesinemine(char t2ht){
	int mitu_korda = 0;
  for(int i = 0; i < m.length; i++){
		  mitu_korda += m[i].T2heesinemine(t2ht);
	 }
	 return mitu_korda;
}
public int S6nadearv(){
	return m.length;
}
public S6na kysiS6na(int nr){
   return m[nr] ;
}
}
