import java.io.*;
import java.net.*;
public class Veeb1{
	public static void main(String[] args) throws IOException{
		BufferedReader lugeja=new BufferedReader(new InputStreamReader(
		  new URL("http://www.tlu.ee/~jaagup/andmed/ilm/harkutund.txt").
		  openConnection().getInputStream()
		));
		String rida=lugeja.readLine();
		System.out.println(rida);
		lugeja.close();
	}
}