public class Kasutus{
	public static void main(String[] arg){

		T2htedeLoendur loendur = new HarilikT2htedeLoendur("tere");


    System.out.println("e tähti on sõnas tere "+loendur.mituT2hte('e'));
    System.out.println("a tähti on sõnas tere "+loendur.mituT2hte('a'));
    System.out.println("t tähti on sõnas tere "+loendur.mituT2hte('t'));
		}

	}
