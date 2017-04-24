package com.kontrolltoo;

public class IoonRakendamine implements Ioon {

    String nimetus;
    double aatom_mass;
    int laeng;

    public IoonRakendamine(String nimetus, double aatom_mass, int laeng) {
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

    public int getCharge() {
        return laeng;
    }
}
