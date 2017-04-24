package com.example;

/**
 * Created by User on 22-Apr-17.
 */
public class JoonKlass2 implements Joon {


    double kordaja;
    double vabaliige;

    public JoonKlass2(double kordaja, double vabaliige) {

        this.kordaja = kordaja;
        this.vabaliige = vabaliige;
    }


    @Override
    public double lieaY(double x) {
        return kordaja * x + vabaliige;
    }

}
