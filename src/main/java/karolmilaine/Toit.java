package karolmilaine;

import java.util.ArrayList;
import java.util.List;

public class Toit {
    public String nimetus;


    public List<Toidukomponendid> toidukomponendidList = new ArrayList<>();

    public double getValgud(double valgudFrom, double kogus) {
        double valgud = valgudFrom * kogus;
        return valgud;
    }

    public double getRasvad(double rasvadFrom, double kogus) {
        double rasvad = rasvadFrom * kogus;
        return rasvad;
    }

    public double getSusivesikud(double susivesikudFrom, double kogus) {
        double susivesikud = susivesikudFrom * kogus;
        return susivesikud;
    }

    public String vajalikKogus(double soov) {
        double kogused = 0;
        if (toidukomponendidList.size() > 0) {
            for (int i = 0; i < toidukomponendidList.size(); i++) {
                kogused = kogused + toidukomponendidList.get(i).kogus;
            }
        }

        double vajadus = soov / kogused;
        StringBuffer sb = new StringBuffer();
        if (toidukomponendidList.size() > 0) {
            for (int i = 0; i < toidukomponendidList.size(); i++) {
                sb.append("<tr><td> " + toidukomponendidList.get(i).t.nimetus + "</td>");
                sb.append("<td> " + (vajadus * toidukomponendidList.get(i).kogus) + "</td></tr>");
            }
            String thead = "<tr><th>Toiduaine nimetus </th><th>kogus </th></tr>";
            return thead + "<br>" + sb.toString();
        } else {
            return "Pole";
        }
    }


    @Override
    public String toString() {
        double kogused = 0;
        StringBuffer sb = new StringBuffer();
        if (toidukomponendidList.size() > 0) {
            for (int i = 0; i < toidukomponendidList.size(); i++) {
                kogused = kogused + toidukomponendidList.get(i).kogus;
                sb.append("<tr><td> " + toidukomponendidList.get(i).t.nimetus + "</td>");
                sb.append("<td> " + toidukomponendidList.get(i).kogus + "</td>");
                sb.append("<td> " + getValgud(toidukomponendidList.get(i).t.valgud, toidukomponendidList.get(i).kogus) + "</td>");
                sb.append("<td> " + getRasvad(toidukomponendidList.get(i).t.rasvad, toidukomponendidList.get(i).kogus) + "</td>");
                sb.append("<td> " + getSusivesikud(toidukomponendidList.get(i).t.susivesikud, toidukomponendidList.get(i).kogus) + "</td></tr>");
            }
            String thead = "<tr><th>Toiduaine nimetus </th><th>kogus </th><th>Valgud </th><th>Rasvad </th><th>Susivesikud </th><th>Kogus kokku </th></tr>";
            return thead + "<br>" + sb.toString() + "<br>" + kogused;
        } else {
            return "Pole";
        }
    }
}
