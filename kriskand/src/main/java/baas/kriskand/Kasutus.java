import java.util.*;
public class Kasutus{	
 	public static double arvutus(Funktsioon fn, double arv){
 		return fn.f(arv);
 	}
 	public static void main(String[] arg){
 		
 		Funktsioon yvaartuseArvutaja=new Yvaartus(5);
 		
 		System.out.println(arvutus(yvaartuseArvutaja, 3));
	}
}