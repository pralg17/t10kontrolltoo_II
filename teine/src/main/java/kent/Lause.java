package kent;
public class Lause implements Liides{
	String lause=" ";
	int paljusõnu= 0;
	HarilikT2htedeLoendur[] m;





	public void lisa(String tekst){
		lause=tekst;
		String[] sonad = tekst.split(" ");
		m = new HarilikT2htedeLoendur[sonad.length];
		for(int i = 0; i < sonad.length; i++){
			m[i] = new HarilikT2htedeLoendur(sonad[i]);

		}
	}
	public String kysi(){
		return lause;
	}

	public HarilikT2htedeLoendur[] kysiS6nad(){
		return m;
	}
/*
	public int mitutükkiA(){
		for(int i=0;i<lause.length();i++) {
			if(lause.charAt(i) == 'a') {
				paljuA++;
			}
		}
		return paljuA;
	}
*/

public int mituT2hte(char c){
int counter = 0;
for( int i=0; i<m.length; i++ ) {
	counter += m[i].mituT2hte(c);

  }
  return counter;
}

	public int paljusõnuon(){

	return m.length;
	}

}
