package com.kontrolltoo;

public class IoonRakendus implements Ioon {

    String nimetus;
    double aatom_mass;
    int laeng;

    public IoonRakendus(String nimetus, double aatom_mass, int laeng) {
        this.nimetus = nimetus;
        this.aatom_mass = aatom_mass;
        this.laeng = laeng;
    }

    public boolean isPositive() {
        if (laeng > 0) {
            return true;
        } else if (laeng < 0) {
            return false;
        }else{
            return false;
        }
    }

    public int getLaeng() {
        return laeng;
    }
}
