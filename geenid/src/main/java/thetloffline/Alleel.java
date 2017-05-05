package thetloffline;

public class Alleel {
	String nimetus;
	boolean v22rtus;

	public Alleel(String nimetus, boolean v22rtus) {
		if (nimetus == null || nimetus.length() == 0) {
			throw new RuntimeException("Alleeli nimetus puudub!");
		}
		this.nimetus = nimetus;
		this.v22rtus = v22rtus;
	}
	 // return kui tahta testida, siis tuleb midagi tagastada
}