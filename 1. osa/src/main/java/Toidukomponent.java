
public class Toidukomponent {

    Toiduaine t;
    double kogus;

    public Toidukomponent(Toiduaine t,double kogus) {
        this.t=t;
        this.kogus = kogus;
    }

    public double Rasvaprotsent(){
        return (kogus/100)*t.rasv;
    }

}
