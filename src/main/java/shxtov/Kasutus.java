package shxtov;


import java.util.*;

public class Kasutus{
	
	    public static double[] JooneFunktsioon(double[]x, yLine joon){
        double[]y = new double[x.length]; 
        for (int i = 0; i <x.length ; i++) {
            y[i] = joon.f(x[i]);
        }
        return y;
    }
	
	
	

	public static void main(String[] arg){
	
		
		yLine x1=new xValue(3);
		System.out.println(x1.f(2.0));
		
		
		
		
		yLine vabaliikmega=new Vabaliige(3.0,4.0);
		double[] x = new double[]{0.0,1.0,10.0};
        double [] y =  JooneFunktsioon(x,vabaliikmega);
        for (int i = 0; i <y.length ; i++) {
            System.out.println(y[i]);
        }
		
		
	}
}