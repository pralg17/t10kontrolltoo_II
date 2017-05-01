package com.kontrolltoo;

public class IoonRakendamine implements Ioon {

    String name;
    double atom_mass;
    int charge;

    public IoonRakendamine(String name, double atom_mass, int charge) {
        this.name = name;
        this.atom_mass = atom_mass;
        this.charge = charge;
    }

    public boolean isPositive() {
        if (charge > 0) {
            return true;
        } else if (charge < 0) {
            return false;
        }else{
            return false;
        }
    }

    public int getCharge() {
        return charge;
    }

    public double getMass() {
        return atom_mass;
    }

    public String getName(){
        return name;
    }
}
