package com.example;


/**
 * Created by hinrek on 20/04/2017.
 */

public class ToiduKomponendid {

    public double kogus;
    Toiduaine toiduaine;

    public double rasvakogus(){
        return (toiduaine.rasvad / 100) * kogus;
    }
}
