import java.io.*;
public class Failid4{
	public static String t88tle(String rida){
		String[] m=rida.split(";");
		double summa=0;
		int koht=1;
		while(koht<m.length){
			summa+=Integer.parseInt(m[koht]);
			koht++;
		}
		return m[0].split(" ")[1]+";"+summa/(koht-1);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader lugeja=new BufferedReader(
			new FileReader("andmestik1.txt")
		);
		PrintWriter kirjutaja=new PrintWriter(new FileWriter(
		"andmestik2.txt"));
		
		String rida=lugeja.readLine();
		while(rida!=null){
			System.out.println(rida);
			kirjutaja.println(t88tle(rida));
			rida=lugeja.readLine();
		}
		lugeja.close();
		kirjutaja.close();
		
	}
}