public class Katsetus1{
	public static void main (String[] arg){
		T2heLugeja lugeja = new HarilikLugeja ("tere");

		System.out.println("Sõnas 'tere' on 'a' tähte "+lugeja.paljuT2hti('a'));
		System.out.println("Sõnas 'tere' on 't' tähte "+lugeja.paljuT2hti('t'));
		System.out.println("Sõnas 'tere' on 'e' tähte "+lugeja.paljuT2hti('e'));

	}
}
