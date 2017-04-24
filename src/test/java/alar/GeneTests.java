package alar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Alar Aasa on 20.04.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneTests {
    @Test
    public void contextLoads(){}

    @Test
    public void alleleTest(){
        Allele allele1 = new Allele("Reesus", true);
        Assert.assertEquals("Reesus", allele1.getName());
        Assert.assertEquals(true, allele1.getPositive());
    }

    @Test
    public void geneTestAuto(){
        Allele allele1 = new Allele("Reesus", false);
        Allele allele2 = new Allele("Teine", true);
        Gene gene = new Gene(allele1, allele2);
        Assert.assertEquals(true, gene.getPositive());
        Assert.assertEquals(false, gene.getAllele1().getPositive());
        Assert.assertEquals("Teine", gene.getAllele2().getName());
        gene.getAllele2().setPositive(false);
        gene.setPositive();
        Assert.assertEquals(false, gene.getPositive());
    }

    @Test
    public void generateNewGeneTest(){
        Allele allele1 = new Allele("Esimene", false);
        Allele allele2 = new Allele("Teine", true);
        Allele allele3 = new Allele("Kolmas", false);
        Allele allele4 = new Allele("Neljas", true);

        Gene gene1 = new Gene(allele1, allele2);
        Gene gene2 = new Gene(allele3, allele4);
        Gene gene3 = new Gene(gene1, gene2);

        Assert.assertNotNull(gene3.getAllele1());
        Assert.assertNotNull(gene3.getAllele2());
        Assert.assertNotNull(gene3.getPositive());
    }
}
