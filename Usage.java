import java.util.*;
public class Usage{

	public static String calculate(Function fn, double x){
		return fn.y(x);
	}

	
	public static void main(String[] arg){
		yax yaxCalculate=new yax(3);
		yaxb yaxbCalculate=new yaxb(5, 6);
		System.out.println(calculate(yaxCalculate, 3));
		System.out.println(calculate(yaxCalculate, 5));
		System.out.println(calculate(yaxCalculate, 8));
		System.out.println(calculate(yaxbCalculate, 3));
		System.out.println(calculate(yaxbCalculate, 5));
		System.out.println(calculate(yaxbCalculate, 8));

	}
}