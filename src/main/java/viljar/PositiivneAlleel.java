package viljar;
public class PositiivneAlleel{
  String x;
  int count=0;
  public String PositiivneAlleel(Geen1[] sisu){
    try{
      for(int i=0; i<sisu.length; i++ ){
        if(sisu[0].getNimetus().equals(sisu[1].getNimetus())&&sisu[i].gettoevaartus()==1){
              count++;
        }
          if (count>0){
            x="Üks samanimelistest alleelidest on vähemalt positiivne";
        }else{x= "Alleelide nimetused ei kattunud või polnud positiivseid alleele";}
      }
    }catch(Exception e){}
    return x;
  }
}
