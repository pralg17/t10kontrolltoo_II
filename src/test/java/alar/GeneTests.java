package alar;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by Alar Aasa on 20.04.2017.
 */
@SpringBootTest
public class GeneTests {
    @Test
    public void contextLoads(){}

    @Test
    public void alleleTest(){
        Allele allele1 = new Allele("Reesus", true);
        Assert.assertEquals("Reesus", allele1.getName());
        Assert.assertEquals(true, allele1.getPositive());
        Assert.assertEquals("Positive", allele1.positiveToString());
    }

    @Test
    public void geneTest(){
        Allele allele1 = new Allele("Reesus", false);
        Allele allele2 = new Allele("Reesus", true);
        Gene gene = new Gene("Gene1", allele1, allele2);
        Assert.assertEquals(true, gene.getPositive());
        Assert.assertEquals(false, gene.getAllele1().getPositive());
        Assert.assertEquals("Reesus", gene.getAllele2().getName());
        gene.getAllele2().setPositive(false);
        gene.setPositive();
        Assert.assertEquals(false, gene.getPositive());
    }

    @Test
    public void wrongAllelesTest(){
        Allele allele1 = new Allele("Name1", true);
        Allele allele2 = new Allele("Name2", true);
        Gene gene = new Gene("Gene", allele1, allele2);
        Assert.assertNull(gene.getName());
        Assert.assertNull(gene.getAllele1());
        Assert.assertNull(gene.getAllele2());
    }

    @Test
    public void generateNewGeneTest(){
        Allele allele1 = new Allele("Esimene", false);
        Allele allele2 = new Allele("Esimene", true);
        Allele allele3 = new Allele("Teine", false);
        Allele allele4 = new Allele("Teine", true);

        Gene gene1 = new Gene("Gene1", allele1, allele2);
        Gene gene2 = new Gene("Gene1", allele3, allele4);
        Gene gene3 = new Gene(gene1, gene2);

        Assert.assertEquals("Gene1", gene3.getName());
        Assert.assertNotNull(gene3.getAllele1());
        Assert.assertNotNull(gene3.getAllele2());
        Assert.assertNotNull(gene3.getPositive());
    }
}
