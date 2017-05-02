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

    @RequestMapping("/listAllAlleles")
    public String getAlleles(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Allele item: alleleDao.findAll()){
            stringBuilder.append("<tr>").
                    append("<td>").
                    append(item.getId()).
                    append("</td><td>").
                    append(item.getName()).
                    append("</td><td>").
                    append(item.positiveToString()).
                    append("</td>").
                    append("</tr>");
        }
        return stringBuilder.toString();
    }

    @RequestMapping("/listAllGenes")
    public String listAllGenes(){
        StringBuilder sb = new StringBuilder();
        for(Gene item: geneDao.findAll()){
            sb.append("<tr><td>").
                    append(item.getId()).
                    append("</td><td>").
                    append(item.getName()).
                    append("</td><td>").
                    append(item.getAllele1().getName()).
                    append("(").
                    append(item.getAllele1().positiveToString()).
                    append(")").
                    append("</td><td>").
                    append(item.getAllele2().getName()).
                    append("(").
                    append(item.getAllele2().positiveToString()).
                    append(")").
                    append("</td><td>").
                    append(item.positiveToString()).
                    append("</td></tr>");
        }
        return sb.toString();
    }
    @RequestMapping("/selectAllAlleles")
    public String selectAllAlleles(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Allele item: alleleDao.findAll()){
            stringBuilder.append("<option value='")
                    .append(item.getId())
                    .append("'>")
                    .append(item.getName())
                    .append("(")
                    .append(item.positiveToString())
                    .append(")")
                    .append("</option>");
        }
        return stringBuilder.toString();
    }

    @RequestMapping("/selectAllGenes")
    public String selectAllGenes(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Gene item: geneDao.findAll()){
            stringBuilder.append("<option value='")
                    .append(item.getId())
                    .append("'>")
                    .append(item.getName())
                    .append(" (ID: ")
                    .append(item.getId())
                    .append(")</option>");
        }
        return stringBuilder.toString();
    }

    @RequestMapping("/createallele")
    public String createAllele(String name, String positive){
        Boolean positivity = positive.equals("True");
        alleleDao.save(new Allele(name, positivity));
        return "New allele created!";
    }

    @RequestMapping("/creategene")
    public String createGene(String name, String a1, String a2) {
        Allele allele1 = findAllele(Integer.parseInt(a1));
        Allele allele2 = findAllele(Integer.parseInt(a2));

        if(allele1.getName().equals(allele2.getName())){
            geneDao.save(new Gene(name, allele1, allele2));
            return "New gene created!";
        }
        return "Gene not created. To create a new gene, the alleles must have the same names!";
    }

    @RequestMapping("/generategene")
    public String generateGene(String g1, String g2){
        Gene gene1 = findGene(Integer.parseInt(g1));
        Gene gene2 = findGene(Integer.parseInt(g2));
        String response = null;
        if(gene1 != null && gene2 != null){
            Allele allele1 = gene1.getRandomAllele();
            Allele allele2 = gene2.getRandomAllele();
            if(gene1.getName().equals(gene2.getName())){
                geneDao.save(new Gene(gene1.getName(), allele1, allele2));
                response = "New gene created!" + "\n Alleles: " + allele1.getName() + "(" + allele1.positiveToString() + "), " +
                        allele2.getName() + "(" + allele2.positiveToString() + ")\n";
            } else {
                response = "To generate a new gene from parents, the gene names must be the same. \n";
            }
            return response;
        } else {
            return "Genes with the ID " + g1 + " and/or " + g2 + " does not exist.";
        }

    }

    @RequestMapping("/searchGene")
    public String searchGene(String name){
        StringBuilder stringBuffer = new StringBuilder();
        for(Gene gene: geneDao.findAll()){
            if(gene.getName().equals(name)){
                stringBuffer.append("<tr><td>").
                        append(gene.getId()).
                        append("</td><td>").
                        append(gene.getName()).
                        append("</td><td>").
                        append(gene.getAllele1().getName()).
                        append("</td><td>").
                        append(gene.getAllele2().getName()).
                        append("</td><td>").
                        append(gene.positiveToString()).
                        append("</td></tr>");
            }
        }

        return stringBuffer.toString();
    }

    private Allele findAllele(Integer id){
        Allele result = null;
        for(Allele item: alleleDao.findAll()){
            if(item.getId().equals(id)){
                result = item;
            }
        }
        return result;
    }

    private Gene findGene(Integer id){
        Gene result = null;
        for(Gene item: geneDao.findAll()){
            if(item.getId().equals(id)){
                result = item;
            }
        }
        return result;
    }
}
