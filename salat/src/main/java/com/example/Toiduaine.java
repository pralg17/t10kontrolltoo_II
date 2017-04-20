package com.example;

/**
 * Created by hinrek on 20/04/2017.
 */
public class Toiduaine {
    public String nimetus;
    public double valgud;
    public double rasvad;
    public double sysivesikud;

    public Toiduaine(String nimetus, double valgud, double rasvad, double sysivesikud) {
        this.nimetus = nimetus;
        this.valgud = valgud;
        this.rasvad = rasvad;
        this.sysivesikud = sysivesikud;

        if((valgud + rasvad + sysivesikud) > 100){
            throw new RuntimeException("Valkude, rasvade ja sysivesikute protsent ei tohi yletada 100%");
        }

        if(nimetus == null){
            throw new RuntimeException("Nimetus puudub");
        }


    }
}
