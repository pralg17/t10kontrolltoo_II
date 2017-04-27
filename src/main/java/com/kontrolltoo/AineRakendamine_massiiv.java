package com.kontrolltoo;

public class AineRakendamine_massiiv implements Aine {

    private String name;
    private double mass;
    private int charge;

    public AineRakendamine_massiiv(IoonRakendamine... ioonid) {
        
    }

    @Override
    public double giveMass() {
        return mass;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCharge() {
        return charge;
    }
}
