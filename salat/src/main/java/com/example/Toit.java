package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hinrek on 24/04/2017.
 */
public class Toit {
    public String nimetus;


    public List<ToiduKomponendid> toiduKomponendidList = new ArrayList<>();

    public double getValgud(double valgudFrom, double kogus) {
        double valgud = valgudFrom * kogus;
        return valgud;
    }

    public double getRasvad(double rasvadFrom, double kogus) {
        double rasvad = rasvadFrom * kogus;
        return rasvad;
    }

    public double getSysivesikud(double sysivesikudFrom, double kogus) {
        double sysivesikud = sysivesikudFrom * kogus;
        return sysivesikud;
    }

    public String vajalikKogus(double soov) {
        double kogused = 0;
        if (toiduKomponendidList.size() > 0) {
            for (int i = 0; i < toiduKomponendidList.size(); i++) {
                kogused = kogused + toiduKomponendidList.get(i).kogus;
            }
        }

        double vajadus = soov / kogused;
        StringBuffer sb = new StringBuffer();
        if (toiduKomponendidList.size() > 0) {
            for (int i = 0; i < toiduKomponendidList.size(); i++) {
                sb.append("<tr><td> " + toiduKomponendidList.get(i).toiduaine.nimetus + "</td>");
                sb.append("<td> " + (vajadus * toiduKomponendidList.get(i).kogus) + "</td></tr>");
            }
            String thead = "<tr><th>Toiduaine nimetus </th><th>kogus </th></tr>";
            return thead + "<br>" + sb.toString();
        } else {
            return "Tyhi";
        }
    }


    @Override
    public String toString() {
        double kogused = 0;
        StringBuffer sb = new StringBuffer();
        if (toiduKomponendidList.size() > 0) {
            for (int i = 0; i < toiduKomponendidList.size(); i++) {
                kogused = kogused + toiduKomponendidList.get(i).kogus;
                sb.append("<tr><td> " + toiduKomponendidList.get(i).toiduaine.nimetus + "</td>");
                sb.append("<td> " + toiduKomponendidList.get(i).kogus + "</td>");
                sb.append("<td> " + getValgud(toiduKomponendidList.get(i).toiduaine.valgud, toiduKomponendidList.get(i).kogus) + "</td>");
                sb.append("<td> " + getRasvad(toiduKomponendidList.get(i).toiduaine.rasvad, toiduKomponendidList.get(i).kogus) + "</td>");
                sb.append("<td> " + getSysivesikud(toiduKomponendidList.get(i).toiduaine.sysivesikud, toiduKomponendidList.get(i).kogus) + "</td></tr>");
            }
            String thead = "<tr><th>Toiduaine nimetus </th><th>kogus </th><th>Valgud </th><th>Rasvad </th><th>Sysivesikud </th><th>Kogus kokku </th></tr>";
            return thead + "<br>" + sb.toString() + "<br>" + kogused;
        } else {
            return "Tühi";
        }
    }
}