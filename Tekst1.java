public class Tekst1{
	public static void main(String[] args){
		String andmerida="2017-02-14 13:45;486;487;485";
	    String[] m=andmerida.split(";");
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println(m[3]);
		int a1=Integer.parseInt(m[1]);
		int a2=Integer.parseInt(m[2]);
		int a3=Integer.parseInt(m[3]);
		double keskmine=(a1+a2+a3)/3-0;
		/*System.out.println(keskmine);*/
		String a = m[0];
		String[] s = a.split(" ");
		String[] p = s[1].split(":");
		System.out.println(p[0]+" tundi ja "+p[1]+" minutit.");
		
	}
}