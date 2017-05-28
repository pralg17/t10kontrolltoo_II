package kristel;
 public class Lause implements Liides{
 	String lause=" ";
 	int paljusõnu= 0;
 	HarilikT2heLoendur[] m;

 	public void lisa(String tekst){
 		lause=tekst;
 		String[] sonad = tekst.split(" ");
 		m = new HarilikT2heLoendur[sonad.length];
 		for(int i = 0; i < sonad.length; i++){
 			m[i] = new HarilikT2heLoendur(sonad[i]);

 		}
 	}
 	public String kysi(){
 		return lause;
 	}

 	public HarilikT2heLoendur[] kysiS6nad(){
 		return m;
 	}


 public int paljuT2hti(char c){
 int counter = 0;
 for( int i=0; i<m.length; i++ ) {
 	counter += m[i].paljuT2hti(c);

   }
   return counter;
 }

 	public int paljusõnuon(){

 	return m.length;
 	}

 }
