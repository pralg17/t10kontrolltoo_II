public class Toiduained {
  String nimetus;
  double valkudeProtsent;
  double rasvadeProtsent;
  double sysivesikuteProtsent;

  public Toiduained(String nimetus, double valkudeProtsent, double rasvadeProtsent, double sysivesikuteProtsent){

    this.nimetus = nimetus;
    this.valkudeProtsent = valkudeProtsent;
    this.rasvadeProtsent = rasvadeProtsent;
    this.sysivesikuteProtsent = sysivesikuteProtsent;

    if(valkudeProtsent + rasvadeProtsent + sysivesikuteProtsent > 100){
      //System.out.println("Protsent kokku ei saa ületada arvu 100!");
      throw new RuntimeException("Protsent kokku ei saa ületada arvu 100!");
    }
  }
}
