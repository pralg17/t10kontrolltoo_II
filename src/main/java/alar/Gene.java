package alar;

import java.util.Random;

/**
 * Created by AASA on 20.04.2017.
 */
public class Gene {
    private Allele allele1;
    private Allele allele2;
    private Boolean positive;

    public Allele getAllele1() {
        return allele1;
    }

    public void setAllele1(Allele allele) {
        this.allele1 = allele;
    }

    public Allele getAllele2() {
        return allele2;
    }

    public void setAllele2(Allele alleel2) {
        this.allele2 = alleel2;
    }

    public Boolean getPositive() {
        return positive;
    }

    public Gene(Allele allele1, Allele allele2) {
        this.allele1 = allele1;
        this.allele2 = allele2;
        setPositive();
    }

    public void setPositive() {
        this.positive = (allele1.getPositive() || allele2.getPositive());
    }

    public Allele getRandomAllele() {
        Random rng = new Random();
        int low = 1;
        int high = 2;
        int result = rng.nextInt(high - low) + low;
        if (result == 1) {
            return getAllele1();
        }
        return getAllele2();
    }

    public Gene generateGene(Gene gene1, Gene gene2){
        return new Gene(gene1.getRandomAllele(), gene2.getRandomAllele());
    }
}
