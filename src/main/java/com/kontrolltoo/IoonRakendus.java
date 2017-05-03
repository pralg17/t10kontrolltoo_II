package com.kontrolltoo;

public class IoonRakendus implements Ioon {

    private String nimetus;
    private double aatom_mass;
    private int laeng;

    public IoonRakendus(String nimetus, double aatom_mass, int laeng) {
        this.nimetus = nimetus;
        this.aatom_mass = aatom_mass;
        this.laeng = laeng;
    }

    public boolean isPositive() {
        if (laeng > 0) {
            return true;
        } else if (laeng < 0){
	        return false;
        }
	    return false;
    }

    public int getCharge() {
        return laeng;
    }

    public String getName(){
        return nimetus;
    }

    public double getMass(){
    	return aatom_mass;
    }
}
