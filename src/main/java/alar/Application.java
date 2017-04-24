package alar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alar Aasa on 20.04.2017.
 */
@RestController
@SpringBootApplication
public class Application {

    private final AlleleDao alleleDao;
    private final GeneDao geneDao;

    @Autowired
    public Application(AlleleDao alleleDao, GeneDao geneDao){
        this.alleleDao = alleleDao;
        this.geneDao = geneDao;
    }
    
    @RequestMapping("/")
    public String start(){
        return "Hello";
    }

    @RequestMapping("/getallalleles")
    public String getAlleles(){
        StringBuilder sb = new StringBuilder();
        for(Allele item: alleleDao.findAll()){
            sb.append(item);
        }
        return sb.toString();
    }

    @RequestMapping("/getallgenes")
    public String getGenes(){
        StringBuilder sb = new StringBuilder();
        for(Gene item: geneDao.findAll()){
            sb.append(item);
        }
        return sb.toString();
    }

    @RequestMapping("/createallele")
    public String createAllele(String name, Boolean positive){
        alleleDao.save(new Allele(name, positive));
        return "New allele created!";
    }

    @RequestMapping("/creategene")
    public String createGene(Allele allele1, Allele allele2) {
        geneDao.save(new Gene(allele1, allele2));
        return "New gene created!";
    }

    @RequestMapping("/generategene")
    public String generateGene(Gene gene1, Gene gene2){
        createGene(gene1.getRandomAllele(), gene2.getRandomAllele());
        return "New gene generated!";
    }

    @RequestMapping("/deletegene")
    public String deleteGene(Gene gene){
        geneDao.delete(gene);
        return "Gene deleted!";
    }


//    public Boolean intToBool(Integer num){
//        if(num<0 || num>1){
//            throw new IllegalArgumentException("Input more than 0 or 1");
//        }
//        return num.equals(1);
//    }
}
