public class Toitukomponendid{
		Toituained t;
	double quantity;
	
	double fatquantity(){
		if(t==null){
		return quantity;
	}
	return(quantity*t.fats)/100;
	}
	
}