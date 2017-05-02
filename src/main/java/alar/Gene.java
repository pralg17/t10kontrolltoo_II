package alar;
import javax.persistence.*;
import java.util.Random;

/**
 * Created by Alar Aasa on 20.04.2017.
 */
@Entity
@Table(name="gene")
public class Gene {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "allele1")
    private Allele allele1;

    @ManyToOne
    @JoinColumn(name = "allele2")
    private Allele allele2;

    private Boolean positive;

    String getName() {return name;}
    public void setName(String name) {this.name = name;}

    Allele getAllele1() {
        return allele1;
    }
    public void setAllele1(Allele allele) {
        this.allele1 = allele;
    }

    Allele getAllele2() {
        return allele2;
    }
    public void setAllele2(Allele allele2) {
        this.allele2 = allele2;
    }

    Boolean getPositive() {
        return positive;
    }
    void setPositive() {
        this.positive = (allele1.getPositive() || allele2.getPositive());
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    Gene(){
        //EMPTY
    }

    Gene(String name, Allele allele1, Allele allele2) {
        if(allele1.getName().equals(allele2.getName())){
            this.name = name;
            this.allele1 = allele1;
            this.allele2 = allele2;
            setPositive();
        }
    }

    Gene(Gene gene1, Gene gene2){
        if(gene1.getName().equals(gene2.getName())){
            this.name = gene1.getName();
            this.allele1 = gene1.getRandomAllele();
            this.allele2 = gene2.getRandomAllele();
            setPositive();
        }
    }



    Allele getRandomAllele() {
        Random rng = new Random();
        int low = 1;
        int high = 2;
        int result = rng.nextInt(high - low) + low;
        if (result == 1) {
            return getAllele1();
        }
        return getAllele2();
    }

    String positiveToString(){
        if(positive){
            return "Positive";
        } else {
            return "Negative";
        }
    }

}
