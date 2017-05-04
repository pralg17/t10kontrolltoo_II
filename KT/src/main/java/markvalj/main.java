package markvalj;

public class main {
	public static void main(String[] args){
		
	v6rrand v6rrand1 = new v6rrand();
	
	
	
	
	System.out.println("Sirgjoone võrrand on y=" + v6rrand1.xKordaja + "x");
	System.out.println("Kui X-i väärtus on " + 3 + ", siis Y väärtus on: " + v6rrand1.arvuta(3));
	System.out.println("Kui X-i väärtus on " + 4 + ", siis Y väärtus on: " + v6rrand1.arvuta(4));
	System.out.println("Kui X-i väärtus on " + 5 + ", siis Y väärtus on: " + v6rrand1.arvuta(5));
	
	//kontrollin y=3x joone punkte
	System.out.println(v6rrand1.arvuta2(3));
	}
}
