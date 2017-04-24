package com.example;

/**
 * Created by User on 22-Apr-17.
 */
public class JoonKlass implements Joon {

    double kordaja;

    public JoonKlass( double kordaja) {

        this.kordaja = kordaja;
    }


    @Override
    public double lieaY(double x) {
        return x * kordaja;
    }
}
