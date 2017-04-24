package com.example;

/**
 * Created by User on 22-Apr-17.
 */
public class Main {



    public static double[] FunctionJoon(double[]x, Joon j){

        double[]y = new double[x.length];

        for (int i = 0; i <x.length ; i++) {

            y[i] = j.lieaY(x[i]);
        }

        return y;
    }

    public static void main(String[] args) {

        JoonKlass joonKlass1 = new JoonKlass(3);

        JoonKlass2 joonKlass2 = new JoonKlass2(2,2);

        double[] X = new double[]{3.0,2.0};
        double [] y =  FunctionJoon(X,joonKlass2);

        for (int i = 0; i <y.length ; i++) {

            System.out.println(y[i]);
        }

      //  System.out.println(joonKlass1.lieaY());
    }
}
