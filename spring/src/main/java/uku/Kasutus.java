package uku;


import java.util.*;

public class Kasutus{
	
	    public static double[] JooneFunktsioon(double[]x, yJoon joon){//võtab x-masssiivi 
        double[]y = new double[x.length]; //y massiivi suurus=x massiivi pikkus
        for (int i = 0; i <x.length ; i++) {
            y[i] = joon.f(x[i]);
        }
        return y;
    }
	
	
	

	public static void main(String[] arg){
	
		//1.punkt
		yJoon x1=new xKordaja(3);//xkordaja annan sisse
		System.out.println(x1.f(2.0));
		
		
		
		//2.punkt
		yJoon vabaliikmega=new Vabaliige(3.0,4.0);//kordaja ja vabaliige
		double[] x = new double[]{0.0,1.0,10.0};//x-massiiv
        double [] y =  JooneFunktsioon(x,vabaliikmega);//vastused y massiivi
        for (int i = 0; i <y.length ; i++) {
            System.out.println(y[i]);//y massiiv välja
        }
		
		
	}
}