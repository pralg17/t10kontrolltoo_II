/**
 * Created by tanel on 25-Apr-17.
 */
public class Rakendus {
    public static void main(String[] arg){

        Toiduaine ta1 = new Toiduaine("Kartul", 2,0, 17);
        Toidukomponent tk1 = new Toidukomponent(ta1,300);
        tk1.t =ta1;

        Toiduaine ta2 = new Toiduaine("Hapukoor", 5,20, 20);
        Toidukomponent tk2 = new Toidukomponent(ta2,600);
        tk2.t =ta2;

        Toiduaine ta3 = new Toiduaine("Peekon", 13,41, 0);
        Toidukomponent tk3 = new Toidukomponent(ta3,150);
        tk3.t =ta3;

        System.out.println("Toiduaine: " + ta1.nimetus+ " Kogus: " + tk1.kogus + "g Rasva: "+ tk1.Rasvaprotsent() +"g");
        System.out.println("Toiduaine: " + ta2.nimetus+ " Kogus: " + tk2.kogus + "g Rasva: "+ tk2.Rasvaprotsent() +"g");
        System.out.println("Toiduaine: " + ta3.nimetus+ " Kogus: " + tk3.kogus + "g Rasva: "+ tk3.Rasvaprotsent() +"g");

    }
}
