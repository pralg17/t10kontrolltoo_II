package thetloffline;

public class Proov1 {
	public static void main(String[] args) {
		Alleel reesus1 = new Alleel("reesus", true);
		Alleel reesus2 = new Alleel("reesus", true);

		Geen s6bralik = new Geen();

		s6bralik.alleel1 = reesus1;
		s6bralik.alleel2 = reesus2;

		System.out.println("Alleeli nimetus on: " + reesus1.nimetus + " ja v22rtus on: " + reesus2.v22rtus);
	}
}