package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SalatApplication {

    private final ToiduaineDao toiduaineDao;

    @Autowired
    public SalatApplication(ToiduaineDao toiduaineDao) {
        this.toiduaineDao = toiduaineDao;
    }

    @RequestMapping("/toiduaine")
    public String toiduaine() {
        Toiduaine kartul = new Toiduaine(1, "kartul", 23, 34, 43);
        Toiduaine hapukoor = new Toiduaine(2, "hapukoor", 16, 28, 22);
        Toiduaine vorst = new Toiduaine(3, "vorst", 43, 10, 20);

        return kartul.nimetus + hapukoor.nimetus + vorst.nimetus;
    }

    @RequestMapping("/kartuliSalat")
    public String kartuliSalat(double soov) {
        Toiduaine kartul = new Toiduaine(1, "kartul", 23, 34, 43);
        Toiduaine hapukoor = new Toiduaine(2, "hapukoor", 16, 28, 22);
        Toiduaine vorst = new Toiduaine(3, "vorst", 43, 10, 20);

        ToiduKomponendid kartulKomponent = new ToiduKomponendid();
        kartulKomponent.toiduaine = kartul;
        kartulKomponent.kogus = 100;

        ToiduKomponendid hapukoorKomponent = new ToiduKomponendid();
        hapukoorKomponent.toiduaine = hapukoor;
        hapukoorKomponent.kogus = 30;

        ToiduKomponendid vorstKomponent = new ToiduKomponendid();
        vorstKomponent.toiduaine = vorst;
        vorstKomponent.kogus = 50;

        Toit kartuliSalat = new Toit();
        kartuliSalat.nimetus = "kartuli salat";
        kartuliSalat.toiduKomponendidList.add(kartulKomponent);
        kartuliSalat.toiduKomponendidList.add(hapukoorKomponent);
        kartuliSalat.toiduKomponendidList.add(vorstKomponent);

        return kartuliSalat.vajalikKogus(soov);
    }

    @RequestMapping("/toit")
    public String toiduKomponent() {
        Toiduaine kartul = new Toiduaine(1, "kartul", 23, 34, 43);
        Toiduaine hapukoor = new Toiduaine(2, "hapukoor", 16, 28, 22);
        Toiduaine vorst = new Toiduaine(3, "vorst", 43, 10, 20);

        ToiduKomponendid kartulKomponent = new ToiduKomponendid();
        kartulKomponent.toiduaine = kartul;
        kartulKomponent.kogus = 100;

        ToiduKomponendid hapukoorKomponent = new ToiduKomponendid();
        hapukoorKomponent.toiduaine = hapukoor;
        hapukoorKomponent.kogus = 30;

        ToiduKomponendid vorstKomponent = new ToiduKomponendid();
        vorstKomponent.toiduaine = vorst;
        vorstKomponent.kogus = 50;

        Toit kartuliSalat = new Toit();
        kartuliSalat.nimetus = "kartuli salat";
        kartuliSalat.toiduKomponendidList.add(kartulKomponent);
        kartuliSalat.toiduKomponendidList.add(hapukoorKomponent);
        kartuliSalat.toiduKomponendidList.add(vorstKomponent);


        // System.out.println(kartulKomponent.rasvakogus());
        /*
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < kartuliSalat.toiduKomponendidList.size(); i++) {
            sb.append(kartuliSalat.toiduKomponendidList.get(i));
        }
        sb.append(kartuliSalat.nimetus);
        */

        return kartuliSalat.toString();
    }

    @RequestMapping("/listall")
    public String listall() {
        StringBuffer sb = new StringBuffer();
        for (Toiduaine item : toiduaineDao.findAll()) {
            sb.append(item);
        }
        String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Sysivesikud</th></tr>";
        return thead + sb.toString();
    }

    @RequestMapping("/lisa")
    public String lisa(String nimetus, double valgud, double rasvad, double sysivesikud) {

        Toiduaine toiduaine = new Toiduaine();
        toiduaine.nimetus = nimetus;
        toiduaine.valgud = valgud;
        toiduaine.rasvad = rasvad;
        toiduaine.sysivesikud = sysivesikud;

        if ((valgud + rasvad + sysivesikud) > 100) {
            return toiduaine.protsendiError();
        } else {
            toiduaineDao.save(toiduaine);
            return "Lisatud " + nimetus + valgud + rasvad + sysivesikud;
        }

    }

    @RequestMapping("/kustuta")
    public String kustuta(Integer id) {

        Toiduaine toiduaine = toiduaineDao.findOne(id);
        toiduaineDao.delete(toiduaine);
        return toiduaine.nimetus + " " + " on kustutatud";
    }

    @RequestMapping("/rasvaOtsing")
    public String rasvaOtsing(double rasvadMin, double rasvadMax) {
        StringBuffer sb = new StringBuffer();
        for (Toiduaine item : toiduaineDao.findAll()) {
            if (item.rasvad > rasvadMin && item.rasvad < rasvadMax) {
                sb.append(item);
            }
        }
        String thead = "<tr><th>Id</th><th>Nimetus</th><th>Valgud</th><th>Rasvad</th><th>Sysivesikud</th></tr>";
        return thead + sb.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(SalatApplication.class, args);
    }
}
