package karin;
public class Lugu{
	Kolmkõla[] taktid;
	boolean midi = true;
	
	public Lugu(Kolmkõla[] taktid){
		this.taktid = taktid;
	}
	
		public String noodid(){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < taktid.length; i++){
			if(!midi){
				sb.append(taktid[i].toString2());  //tähed
			} else {
				sb.append(taktid[i].toString());   //midid
			}
				
			
			if(i != taktid.length - 1){
				sb.append(", ");
			}
		}
		return sb.toString();
	}

}

