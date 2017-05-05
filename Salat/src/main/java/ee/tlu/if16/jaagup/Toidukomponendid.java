package ee.tlu.if16.jaagup;
public class Toidukomponendid{
    Toiduained t;
    double kogus;

    double rasvakogus(){
      if(t==null){return kogus;}
      return(kogus*t.rasvad_protsent)/100;
    }


}
