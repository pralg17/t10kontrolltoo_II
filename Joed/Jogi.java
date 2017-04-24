package Joed;

public class Jogi {
    String nimetus;
    double pikkus; //km, meri asub jõe pikkuse lõppes
    double vooluhulk;   //jõe suudmes(в устье), l/s
    String sihtjoeNimetus;
    double sihtjoeAsukoht;

    public Jogi(String nimetus, double pikkus, double vooluhulk, String sihtjoeNimetus, double sihtjoeAsukoht){
        if(nimetus==null || nimetus.length()==0){
            throw new RuntimeException("Nimetus puudub!");
        }
        if(sihtjoeNimetus==null || sihtjoeNimetus.length()==0 && sihtjoeAsukoht == 0){
            System.out.println("See jõgi saabub otse merre!");
        }
        this.nimetus = nimetus;
        this.pikkus = pikkus;
        this.vooluhulk = vooluhulk;
        this.sihtjoeNimetus = sihtjoeNimetus;
        this.sihtjoeAsukoht = sihtjoeAsukoht;
    }
}
