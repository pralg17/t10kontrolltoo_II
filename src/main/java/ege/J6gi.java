package ege;

public class J6gi{
	String nimetus;
	double pikkus, vooluhulk;
	J6gi sihtj6gi;
	double sihtj6eAsukoht;
	
	public J6gi(String nimetus, double pikkus, double vooluhulk, J6gi sihtj6gi, double sihtj6eAsukoht){
		if(sihtj6gi == null || sihtj6eAsukoht == 0){
			System.out.println("See j6gi suubub otse merre!");
		}
		this.nimetus=nimetus;
		this.pikkus=pikkus;
		this.vooluhulk=vooluhulk;
		this.sihtj6gi=sihtj6gi;
		this.sihtj6eAsukoht=sihtj6eAsukoht;
	}

}