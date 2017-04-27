import java.util.*;
public class Kasutus1{	
	public static double arvuta(Funktsioon fn, double arv){
		return fn.f(arv);
	}
	public static void main(String[] arg){
		
		Funktsioon yvaartuseArvutaja=new Yvaartus(5);
		/*
		Funktsioon lahutamisArvutaja=new LahutamisFunktsioon(3);
		Funktsioon jagamisArvutaja=new JagamisFunktsioon(25);
		/*
		double[] andmed={3, 11, 7};
		Funktsioon[] arvutajad={liitmisArvutaja, jagamisArvutaja};
		double[][]vastustetabel=arvuta(arvutajad, andmed);
		System.out.println(Arrays.deepToString(vastustetabel));
		*/
		System.out.println(arvuta(yvaartuseArvutaja, 3));
	}
}	