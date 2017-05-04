public class Toituained {
	String name;
	double proteins;
	double fats;
	double carbs;
	
	public Toituained(String name, double proteins, double fats, double carbs){
		if(name==null || name.length()==0){
			throw new RuntimeException ("Enter a name");
			
		} else if(carbs + fats + proteins >= 100){
			throw new RuntimeException("It cannot be more than 100");
			
			
		}
		
		this.name = name;
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		
		
	}
}