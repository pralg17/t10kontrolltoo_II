package com.kontrolltoo;


import java.util.ArrayList;
import java.util.Collections;


class AineRakendamine_massiiv implements Aine {

    private String name = "";
    private double mass;
    private int charge;


    public AineRakendamine_massiiv(IoonRakendamine... ioonid) {
        ArrayList<IoonRakendamine> pos = new ArrayList<>();
        ArrayList<IoonRakendamine> neg = new ArrayList<>();
        ArrayList<IoonRakendamine> unique = new ArrayList<>();


        for (IoonRakendamine ioon : ioonid) this.charge += ioon.getCharge();
        if (this.charge != 0) {
            throw new RuntimeException("This violates the law." + this.getCharge());
        }


        for (IoonRakendamine ioon : ioonid) {
            // Liidame aatommassi kokku.
            this.mass += ioon.getMass();

            // Lisame unikaalsed iooni nimed listi.
            if (!unique.contains(ioon)) {
                unique.add(ioon);
            }

            // Jaotame positiivsed ja negatiivsed ioonid eraldi listidesse.
            if (ioon.getCharge() > 0) pos.add(ioon);
            else neg.add(ioon);
        }


        // Positiivsed ioonid nimesse.
        for(IoonRakendamine ioon2: unique){
            if(ioon2.getCharge()>0){
                int amount = Collections.frequency(pos, ioon2);
                if(amount >1){
                    this.name += ioon2.getName() + Integer.toString(amount);
                }else{
                    this.name += ioon2.getName();
                }
            }else{
                int amount = Collections.frequency(neg, ioon2);
                if(amount >1){
                    this.name += ioon2.getName() + Integer.toString(amount);
                }else{
                    this.name += ioon2.getName();
                }
            }

        }




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
