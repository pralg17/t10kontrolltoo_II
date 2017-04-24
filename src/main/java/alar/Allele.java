package alar;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Alar Aasa on 20.04.2017.
 */
@Entity
@Table(name="allele")
public class Allele {
    @Id
    private String name;
    private Boolean positive;

    public Allele(String name, Boolean positive){
        setName(name);
        setPositive(positive);
    }
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Boolean getPositive() {
        return positive;
    }

    void setPositive(Boolean positive) {
        this.positive = positive;
    }

    public void Allele(Boolean positive) {
        this.positive = positive;
    }
}
