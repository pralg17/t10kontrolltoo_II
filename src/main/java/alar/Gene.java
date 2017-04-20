package alar;

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
}
