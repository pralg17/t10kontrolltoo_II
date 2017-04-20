package alar;

/**
 * Created by AASA on 20.04.2017.
 */
public class Allele {
    private String name;
    private Boolean positive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPositive() {
        return positive;
    }

    public void setPositive(Boolean positive) {
        this.positive = positive;
    }

    public void Allele(Boolean positive) {
        this.positive = positive;
    }
}
