package alar;

import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    private Integer id;
    private String name;
    private Boolean positive;

    public Allele(){
        //EMPTY
    }

    public Allele(String name, Boolean positive){
        setName(name);
        setPositive(positive);
    }

    Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    Boolean getPositive() {
        return positive;
    }

    void setPositive(Boolean positive) {
        this.positive = positive;
    }

    String positiveToString(){
        if(positive){
            return "Positive";
        } else {
            return "Negative";
        }
    }
}
