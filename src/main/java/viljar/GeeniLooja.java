package viljar;
public class GeeniLooja{
  String sisu ="Laps sai alleelid";
  public String GeeniLooja(Geen1[] geen1, Geen1[] geen2){
    Geen1[] laps=new Geen1[2];
    laps[0]= AlleeliLeidja(geen1);
    laps[1]= AlleeliLeidja(geen2);
    return LapseGenoom(laps);
  }
  public Geen1 AlleeliLeidja(Geen1[] geen){
    return geen[new NR().NR()];
  }
  String LapseGenoom(Geen1[] geen ){

   for(Geen1 alleel:geen){
      sisu=sisu+" "+alleel.getNimetus()+" "+alleel.getvaartus();
    }
    return sisu ;
  }
}
