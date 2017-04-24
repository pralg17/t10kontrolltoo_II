package Rait;

public class Joed {
	String nimi;
	double pikkus;         //pikkus kilomeetrites
	double vooluhulk;      //vooluhulk(l/s) suudmes
	String sihtjogi;       //jõgi millese antud jõgi suubub
	double suubumisKm;     //mitmendal suubutava jõe kilomeetril antud jõgi sinna suubub
	
	public Joed(String nimi, double pikkus, double vooluhulk, String sihtjogi, double suubumisKm) {
		
	this.nimi=nimi;
	this.pikkus=pikkus; 
	this.vooluhulk=vooluhulk;
	this.sihtjogi=sihtjogi;
	this.suubumisKm=suubumisKm;
	
	}
	
	
	
}