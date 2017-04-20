public class River{
    String riverName, whereFlows;
    double riverLenght, riverFlow;
    //River r;

    public void River(String riverName, double riverFlow, String whereFlows, double riverLenght){
        this.riverName = riverName;
        this.riverFlow = riverFlow;
        this.whereFlows = whereFlows;
    }

    public String getFlows(){
        return whereFlows;
    }

}