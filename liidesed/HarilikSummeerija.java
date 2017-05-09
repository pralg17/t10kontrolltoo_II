public class HarilikSummeerija implements Summeerija{
  int summa=0;
  //loo uus muutuja summa hoidmise tarbeks
  public void lisa(int kogus){
    summa = summa+kogus; //summa += kogus;
    //Suurenda muutujat uue koguse jagu
  }
  public int kysi(){
    //tagasta meelespeetud summa kui anda kolm arvu siis ta suudab need meeles pidada ja vastuse kätte anda
    return summa;}

}
