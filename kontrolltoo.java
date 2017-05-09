import java.util.Scanner;
public class kontrolltoo{
	public static float keskmine(float a, float b, float c){
		float keskmine = (a + b + c)/3;
		return keskmine;
	}
public static void main(String[] args){
		float a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sisesta esimene arv: ");
		a = scan.nextFloat();
  	System.out.print("Sisesta teine arv: ");
  	b = scan.nextFloat();
    System.out.print("Sisesta kolmas arv: ");
    c = scan.nextFloat();
    float keskmine = keskmine(a, b, c);
  		System.out.println("Kolme arvu aritmeetiline keskmine on "+keskmine+".");
	}
}
