package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by hinrek on 20/04/2017.
 */
public class Rakendus {
    @Autowired
    HttpSession session;

    @RequestMapping("/toiduaine")
    public String toiduaine(){
        Toiduaine kartul = new Toiduaine("kartul", 23, 34, 43);
        Toiduaine hapukoor = new Toiduaine("hapukoor", 16, 28, 22);
        Toiduaine vorst = new Toiduaine("vorst", 43, 10, 20);

        return kartul.nimetus + hapukoor.nimetus + vorst.nimetus;
    }

    @RequestMapping("/toidukomponent")
    public String toiduKomponent(){
        ToiduKomponendid komponendid = new ToiduKomponendid();
        komponendid.kogus = 100;
        komponendid.toiduaine = new Toiduaine("kartul", 23, 34, 43);
        

        return null;
    }


}
