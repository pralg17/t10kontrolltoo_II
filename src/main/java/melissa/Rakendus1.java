package melissa;

public class Rakendus1{
    public static void main(String[] arg){
        ioon i1=new ioon("Prooton", 1);
        IoonMass m1=new IoonMass();
        m1.kogus=1;
        m1.us=nimetus.VESINIK;
        m1.aatommass=1;
        m1.laeng=1;
        m1.i=i1;
		
		ioon i2=new ioon("Nitraatioon", 1);
        IoonMass m2=new IoonMass();
        m2.kogus=1;
        m2.us=nimetus.LÄMMASTIK;
        m2.aatommass=14;
        m2.laeng=1;
		m2.i=i2;
		IoonMass m3=new IoonMass();
        m3.kogus=3;
        m3.us=nimetus.HAPNIK;
        m3.aatommass=16;
        m3.laeng=(-2);
        m3.i=i2;

		

        System.out.println(i1.nimetus+" ioonmass on "+(m1.aatommass*m1.kogus)+" ja laeng: "+m1.laeng);
	
		System.out.println(i2.nimetus+" ioonmass on "+((m2.aatommass*m2.kogus)+(m3.aatommass*m3.kogus))+" ja laeng: "+(m2.laeng+m3.laeng));
       
	   
    }
}