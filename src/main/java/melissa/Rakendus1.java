package melissa;

public class Rakendus1{
    public static void main(String[] arg){
        ioon i1=new ioon("Vesinik", 1);
        IoonMass m1=new IoonMass();
        m1.kogus=1;
        m1.us=nimetus.PROOTON;
        m1.aatommass=1;
        m1.laeng=1;
        m1.i=i1;


       

        System.out.println(m1.us+" ioonmass on "+(m1.aatommass*m1.kogus)+" ja laeng: "+m1.laeng);
       
    }
}