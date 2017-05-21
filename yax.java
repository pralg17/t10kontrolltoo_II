import java.io.*;

public class yax implements Function{
	double answer;
	double a;
	public yax(double a){
		this.a = a;
	}
	public String y(double x){
		answer = a * x;
		return "Funktsiooni vaartus x="+x+" puhul on "+answer+". (a="+a+")";
		
	}
	
}