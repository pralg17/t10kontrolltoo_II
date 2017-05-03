package karolmilaine;

public class Toidukomponendid{
    Toiduained t;
    public double kogus;

    public double rasvakogus(){
      if(t==null){return kogus;}
      return(kogus*t.rasvad)/100;
    }


}
