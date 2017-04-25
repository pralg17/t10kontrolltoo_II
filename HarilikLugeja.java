import java.util.Scanner;

public class HarilikLugeja implements Lugeja{

  int count = 0;
	public void lisa(int sagedus){

    String str;
    System.out.println("Sisesta sõna: ");
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();

    char t2ht;
    System.out.println("Sisesta täht, mille sagedust antud sõnas soovid teada: ");
    Scanner scn = new Scanner(System.in);
    t2ht = scn.findInLine(".").charAt(0);

    for (t2ht = (char) 65; t2ht <= 90; t2ht++) {
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (t2ht == str.charAt(i) || (t2ht + 32) == str.charAt(i)) {
                count++;
            }
        }
    }

	}
	public int kysi(){
		return count;
	}
	//tagasta meelespeetud summa
}
