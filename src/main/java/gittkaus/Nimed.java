package gittkaus;

public class Nimed{
	String nimi;
	double pikkus;
	double vooluhulk;
	String suubub;
	double SKM;
	double JKN;


	public Nimed(String nimi, double pikkus, double vooluhulk, String suubub, double SKM, double JKN){
			this.nimi = nimi;
			this.pikkus = pikkus;
			this.vooluhulk = vooluhulk;
			this.suubub = suubub;
			this.SKM = SKM;
			this.JKN = JKN;
		}

	double XPunkt(double JoeX, double SuububA, double SuububB, double SuububC){
		return JoeX+SuububA+SuububB+SuububC;
	}
}