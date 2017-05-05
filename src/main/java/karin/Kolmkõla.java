package karin;
public class Kolmkõla{
	int põhitoon;
	int terts = 0;
	int kvint = 0;
	String[] noodid = {"C", "C#", "D", "EB", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"};
	
	public Kolmkõla(int põhitoon){          //numbrina
		this.põhitoon = põhitoon;
		helistikNumbrites();
		
	}
	public Kolmkõla(String nooditäht){        //tähena
		this.põhitoon = noodinumbriks(nooditäht);
		helistikNumbrites();
	}

	//meetodid
	
	public void helistikNumbrites(){  
		if(põhitoon != 0){
			this.terts = põhitoon + 4;
			this.kvint = põhitoon + 7;
		}
	}
	
	
	public int noodinumbriks(String nooditäht){  //nooditäht -> noodinumbriks
		String tähtnimetus = nooditäht.toUpperCase();
		int noodinumber = 0;
		for(int i = 0; i < noodid.length -1; i++){
			if(noodid[i].equals(tähtnimetus)){
				noodinumber = 60 + i;
			}
		}
		return noodinumber;
	}
	
	public String nooditäheks(int noodinumber){ //noodinumber -> nooditäheks
		String nooditäht = "0";
		while(noodinumber > 72){
			noodinumber -= 12;
		}
		while(noodinumber < 60 && noodinumber != 0 ){
			noodinumber += 12;
		}
		if(noodinumber != 0){
			for(int i = 0; i < noodid.length; i++){
				if(i == noodinumber - 60){
					nooditäht = noodid[i];
				}
			}
		}
		return nooditäht;
	}
	
	public String toString(){            //numbritena
		StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(põhitoon) + ", ");
		sb.append(String.valueOf(terts) + ", ");
		sb.append(String.valueOf(kvint));
		return sb.toString();	
		
	}
	
	public String toString2(){         //tähtedena
		StringBuffer sb = new StringBuffer();
		sb.append(nooditäheks(põhitoon) + ", ");
		sb.append(nooditäheks(terts) + ", ");
		sb.append(nooditäheks(kvint));
		return sb.toString();
			
	}
	
}



	
