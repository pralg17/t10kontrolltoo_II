package Oscar_KT2;

public class River{
    String riverName, whereFlows;
    double riverLenght, riverFlow,x;
    River r,s,m;

    public void River(String riverName, double riverFlow, River r, double riverLenght){
        this.riverName = riverName;
        this.riverFlow = riverFlow;
        this.s = r;
        this.riverLenght = riverLenght;
    }

     public void River(String riverName, double riverFlow, double riverLenght){
        this.riverName = riverName;
        this.riverFlow = riverFlow;
        this.s = null;
        this.riverLenght = riverLenght;
    }
   public River getFlows(){
        return s;
    }

    public String getName(){
        return riverName;
    }

    public double getLenght(){
        return riverLenght;
    }

   public void getRiverTosea(){
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
    } 


}