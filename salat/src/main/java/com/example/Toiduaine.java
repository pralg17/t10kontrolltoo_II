package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hinrek on 20/04/2017.
 */

@Entity
@Table(name = "Toiduaine")
public class Toiduaine {

    @Id
    @GeneratedValue
    public Integer id;
    public String nimetus;
    public double valgud;
    public double rasvad;
    public double sysivesikud;

    public Toiduaine(){

    }

    public Toiduaine(Integer id, String nimetus, double valgud, double rasvad, double sysivesikud) {
        this.id = id;
        this.nimetus = nimetus;
        this.valgud = valgud;
        this.rasvad = rasvad;
        this.sysivesikud = sysivesikud;

    }

    public String protsendiError(){
        String error = "Valkude, rasvade ja sysivesikute protsent ei tohi yletada 100%";
        return error;
    }

    @Override
    public String toString() {
        return "<tr><td>" + id + "</td><td>" + nimetus
                + "</td><td>" + valgud + "</td><td>"
                + rasvad + "</td><td>" + sysivesikud + "</td></tr>";
    }
}
