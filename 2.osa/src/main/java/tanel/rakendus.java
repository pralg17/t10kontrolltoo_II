package tanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class rakendus{
    @Autowired
    private toiduhaldur haldur;

    //http://localhost:1117/lisamine?nimetus=kartul&valk=15&rasv=0&sysivesik=30
    @RequestMapping("/lisamine")
    public String lisamine1(String nimetus, int valk,int rasv,int sysivesik){
        toit t = new toit();
        t.nimetus = nimetus;
        t.valk = valk;
        t.rasv = rasv;
        t.sysivesik = sysivesik;
        if (t.valk+t.rasv+t.sysivesik>100){
            return "Viga! Protsendid ei saa ületada 100%!";
        } else {
            t = haldur.save(t);
            haldur.save(t);
            return nimetus + " salvestatud!" ;
        }

    }

    //http://localhost:1117/toiduuuring?nimetus=kartul
    @RequestMapping("/toiduuuring")
    public String uuring1(String nimetus){
        if(nimetus==null){return "Nimetus määramata";}
        toit t=haldur.findOne(nimetus);
        if(t==null){
            return nimetus+" puudub";
        }
        return "Nimetus: "+nimetus+" Valgud: "+t.valk+" Rasvad: "+t.rasv+" Sysivesikud: "+t.sysivesik;
    }

    //http://localhost:1117/kustuta?nimetus=proov2
    @RequestMapping("/kustuta")
    public String kustuta1(String nimetus){
        toit t = haldur.findOne(nimetus);
        haldur.delete(t);
        return nimetus +" on kustutatud!";
    }

    //http://localhost:1117/rasvaotsing?min=0&max=100
    @RequestMapping("/rasvaotsing")
    public String rasv1(int min, int max){
        StringBuffer sb = new StringBuffer();
        for (toit t: haldur.findAll()) {
            if (t.rasv >= min && t.rasv <= max){
                sb.append(t.nimetus + " Valgud: "+t.valk+" Rasvad: "+t.rasv+" Sysivesikud: "+t.sysivesik+"<br />");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.getProperties().put("server.port", 1117);
        System.getProperties().put("spring.datasource.url","jdbc:mysql://localhost/mysql");
        System.getProperties().put("spring.datasource.username", "root");
        System.getProperties().put("spring.datasource.password", "");
        SpringApplication.run(rakendus.class);
    }
}