package alar;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Random;

/**
 * Created by Alar Aasa on 20.04.2017.
 */
@Entity
@Table(name="gene")
public class Gene {
    @Id
    private String name;
    private Allele allele1;
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

    Gene(Allele allele1, Allele allele2) {
        this.allele1 = allele1;
        this.allele2 = allele2;
        setPositive();
    }

    Gene(Gene gene1, Gene gene2){
        if(gene1.getName().equals(gene2.getName())){
            this.allele1 = gene1.getRandomAllele();
            this.allele2 = gene2.getRandomAllele();
            setPositive();
        }
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




}
