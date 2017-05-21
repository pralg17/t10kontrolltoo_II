import java.io.*;

public class yaxb implements Function{
	double answer;
	double a;
	double b;
	public yaxb(double a, double b){
		this.a = a;
		this.b = b;
	}
	public String y(double x){
		answer = (a * x)+b;
		return "Funktsiooni vaartus x="+x+" puhul on "+answer+". (a="+a+", b="+b+")";
		
	}
	
}