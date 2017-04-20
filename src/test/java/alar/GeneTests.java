package alar;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by AASA on 20.04.2017.
 */
@SpringBootTest
public class GeneTests {
    @Test
    public void contextLoads(){}

    @Test
    public void alleleTest(){
        Allele allele1 = new Allele();
        Assert.assertNull(allele1.getName());
        Assert.assertNull(allele1.getPositive());
        allele1.setName("Reesus");
        allele1.setPositive(true);
        Assert.assertEquals("Reesus", allele1.getName());
        Assert.assertEquals(true, allele1.getPositive());
    }

    @Test
    public void geneTestAuto(){
        Allele allele1 = new Allele();
        Allele allele2 = new Allele();
        allele1.setName("Reesus");
        allele1.setPositive(false);
        allele2.setName("Teine");
        allele2.setPositive(true);
        Gene gene = new Gene(allele1, allele2);
        Assert.assertEquals(true, gene.getPositive());
        Assert.assertEquals(false, gene.getAllele1().getPositive());
        Assert.assertEquals("Teine", gene.getAllele2().getName());
        gene.getAllele2().setPositive(false);
        gene.setPositive();
        Assert.assertEquals(false, gene.getPositive());
    }
}
