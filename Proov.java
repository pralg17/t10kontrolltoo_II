public class Proov{
  public static void main(String[] arg){
    Toiduained t1 = new Toiduained("Kartul", 1.0, 8.0, 20.0);
    Toiduained t2 = new Toiduained("Hapukoor", 3.0, 25.0, 4.0);
    Toiduained t3 =  new Toiduained("Vorst", 16.0, 30.0, 1.0);

    Toidukomponent k1 = new Toidukomponent();
    k1.kogus = 100.0; //grammi
    k1.t = t1;

    Toidukomponent k2 = new Toidukomponent();
    k2.kogus = 30.0; //g
    k2.t = t2;

    Toidukomponent k3 = new Toidukomponent();
    k3.kogus = 50.0; //g
    k3.t = t3;

    System.out.println(k1.kogus+"g toiduaines "+t1.nimetus+" on "+k1.rasvakogus()+"% rasva.");
    System.out.println(k2.kogus+"g toiduaines "+t2.nimetus+" on "+k2.rasvakogus()+"% rasva.");
    System.out.println(k3.kogus+"g toiduaines "+t3.nimetus+" on "+k3.rasvakogus()+"% rasva.");

  }

}
