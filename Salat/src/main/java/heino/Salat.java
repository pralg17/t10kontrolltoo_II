package heino;

import java.util.ArrayList;
import java.util.List;

public class Salat {
    public String nimetus; //Avalik muutuja Salati nimetuse jaoks
            //ÜMARDAJA
            public static double round(double value, int places) {
            if (places < 0) throw new IllegalArgumentException();

            long factor = (long) Math.pow(10, places);
            value = value * factor;
            long tmp = Math.round(value);
            return (double) tmp / factor;
            }
    //Loob listi toidukomponentide hoiustamiseks, Toidukomponentide ArrayList
    public List<Toidukomponendid> toiduKomponendidList = new ArrayList<Toidukomponendid>();

    //Valkude sisaldus etteantud valkude sisalduse ja koguse korrutisena
    public double kysiValgud(double valgud_protsentSisse, double kogus) {

        double valgud_kogus = (valgud_protsentSisse * kogus)/100;

    return valgud_kogus;
        //round(200.3456, 2);
    }

    public double kysiRasvad(double rasvad_protsentSisse, double kogus) { //Funktsioon rasvade sisalduse saamiseks

        double rasvad_kogus = (rasvad_protsentSisse * kogus)/100;

    return rasvad_kogus;
    }

    public double kysiSysivesikud(double sysivesikud_protsentSisse, double kogus) { //Funktsioon süsivesikute sisalduse saamiseks

        double sysivesikud_kogus = (sysivesikud_protsentSisse * kogus)/100;

    return sysivesikud_kogus;
    }


    public String vajalikKogus(double vajalik_kogus) {
        double kogused = 0;
        if (toiduKomponendidList.size() > 0) {
            for (int i = 0; i < toiduKomponendidList.size(); i++) {
                kogused = kogused + toiduKomponendidList.get(i).kogus;
                      }
                }
        double vajadus = vajalik_kogus / kogused;
        StringBuffer sb = new StringBuffer();
        if (toiduKomponendidList.size() > 0) { //Kui listi suurus on suurem kui 0
            for (int i = 0; i < toiduKomponendidList.size(); i++) {
                sb.append("<tr><td> " + toiduKomponendidList.get(i).toiduaine.toiduaine_nimetus + "</td>");
                sb.append("<td> " + round(((vajadus * toiduKomponendidList.get(i).kogus)), 2) + "</td></tr>");
            }
            String thead = "<tr><th>Toiduaine nimetus </th><th>kogus </th></tr>";
    return thead + "<br>" + sb.toString();
        }
        else {
     return "Komponendid puuduvad";
        }
    }

// Kirjutab meetodi üle
  @Override
    public String toString() {
        double kogused = 0;
        //A string buffer is like a String, but can be modified.
        //At any point in time it contains some particular sequence of characters,
        //but the length and content of the sequence can be changed through certain method calls.

      StringBuffer sb = new StringBuffer();
        if (toiduKomponendidList.size() > 0) {
            for (int i = 0; i < toiduKomponendidList.size(); i++) {
              //Küsib iga toidukonponendi koguse ja liidab kokku kogustesse
                kogused = kogused + toiduKomponendidList.get(i).kogus;
                //Esimesena i toiduaine nimetuse
                sb.append("<tr><td> " + toiduKomponendidList.get(i).toiduaine.toiduaine_nimetus + "</td>");
                sb.append("<td> " + toiduKomponendidList.get(i).kogus + "</td>");
                //Saadab meetodisse kysiValgud toiduaine valkude protsendi ja toiduaine koguse saab tagasi protsent x koguse
                sb.append("<td> " + kysiValgud(toiduKomponendidList.get(i).toiduaine.valgud_protsent, toiduKomponendidList.get(i).kogus) + "</td>");
                sb.append("<td> " + kysiRasvad(toiduKomponendidList.get(i).toiduaine.rasvad_protsent, toiduKomponendidList.get(i).kogus) + "</td>");
                sb.append("<td> " + kysiSysivesikud(toiduKomponendidList.get(i).toiduaine.sysivesikud_protsent, toiduKomponendidList.get(i).kogus) + "</td></tr>");
            }
            //Tabel headi nimetused ja sisusse muu HTML kraam
            String thead = "<tr><th>Toiduaine nimetus </th><th>kogus </th><th>Valgud </th><th>Rasvad </th><th>Süsssivesikud </th></tr>";
            //Tagastab HTML osa ja   StringBuffer sb-s oleva info ja kogused
     return thead + "<br>" + sb.toString() + "<br>" + "Kokku:" + kogused;
        }

        else {
          //Kui toiduKomponendidListis pole elemente, siis tagastab errori
     return "ERROR: Salatis pole komponente";
        }
    }
}
