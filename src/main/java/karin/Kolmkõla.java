package karin;
public class Kolmkõla{
	int põhitoon;
	int terts;
	int kvint;
	String[] noodid = {"C", "C#", "D", "EB", "E", "F", "F#", "G", "G#", "A", "B", "H", "C"};
	
	public Kolmkõla(int põhitoon){          //numbrina
		this.põhitoon = põhitoon;
		this.terts = põhitoon + 4;
		this.kvint = põhitoon + 7;
		
	}
	public Kolmkõla(String nooditäht){        //tähena
		this.põhitoon = noodinumbriks(nooditäht);
		this.terts = (noodinumbriks(nooditäht)) + 4;
		this.kvint = (noodinumbriks(nooditäht)) + 7;
	}

	
	//meetodid
	
	public int[] helistikNumbrites(){               
		int[] helistik = {põhitoon, terts, kvint};
		return helistik;              // 60, 64, 67
	}
	
	public String[] helistikNootides(){
		String[] helistikCDE = new String[3];
		int[] helistik = helistikNumbrites();
		for(int i = 0; i < helistik.length; i++){
			helistikCDE[i] = nooditäheks(helistik[i]);
		}
		return helistikCDE;           // C, D, E
	}
	
	public int noodinumbriks(String nooditäht){  //nooditäht -> noodinumbriks
		String tähtnimetus = nooditäht.toUpperCase();
		int noodinumber = 60;
		for(int i = 0; i < noodid.length -1; i++){
			if(noodid[i].equals(tähtnimetus)){
				noodinumber += i;
			}
		}
		return noodinumber;
	}
	
	public String nooditäheks(int noodinumber){ //noodinumber -> nooditäheks
		String nooditäht = "C";
		while(noodinumber > 72){
			noodinumber -= 12;
		}
		while(noodinumber < 60 ){
			noodinumber += 12;
		}
		for(int i = 0; i < noodid.length; i++){
			if(i == noodinumber - 60){
				nooditäht = noodid[i];
			}
		}
		return nooditäht;
	}
	
	
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Noodid: ");
		sb.append(String.valueOf(põhitoon) + ", ");
		sb.append(String.valueOf(terts) + ", ");
		sb.append(String.valueOf(kvint));
		return sb.toString();
		
		
	}
	
}

