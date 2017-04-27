package Oscar_KT2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="river")
public class River{
    @Id
    public String rivername;
    public double riverflow;
    public String whereflows;
    public double riverflowskm;
    public double riverlenght;


    public void River(String rivername, double riverflow, String whereflows, double riverflowskm, double riverlenght){
        this.rivername = rivername;
        this.riverflow = riverflow;
        this.whereflows = whereflows;
        this.riverflowskm = riverflowskm;
        this.riverlenght = riverlenght;
        
    }

/*     public void River(String riverName, double riverFlow, double riverLenght){
        this.riverName = riverName;
        this.riverFlow = riverFlow;
        this.s = null;
        this.riverLenght = riverLenght;
    }*/
   /*public River getFlows(){
        return s;
    }*/
/*
    public String getName(){
        return riverName;
    }

    public double getLenght(){
        return riverLenght;
    }
*/
  /* public void getRiverTosea(){
       System.out.println(getName()+" j6gi l2bib j2gmised j6ed: ");
       m = getFlows();

        while(m != null){
            System.out.println(m.getName());
            m = m.getFlows();
        }
        System.out.println("~~MERES~~");
    }

    public double getLenghtToSea(){
        x += getLenght();
        m = getFlows();
        while(m != null){
            x += m.getLenght();
            m = m.getFlows();
        }
    return x;           
    } */


}