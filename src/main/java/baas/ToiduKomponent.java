public class ToiduKomponent{
	//viit toiduainele
	ToiduAine t;
	double kogus;
	
	double RasvaKogus(){
		//Exception in thread "main" java.lang.NullPointerException
		if(t==null){
			return kogus;
		}
		return(t.rasvad*kogus)/100;
	}
	
}