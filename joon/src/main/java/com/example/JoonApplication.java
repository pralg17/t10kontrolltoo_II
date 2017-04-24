package com.example;

import com.sun.istack.internal.Nullable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import static com.example.Main.FunctionJoon;

@SpringBootApplication
@RestController
public class JoonApplication {
    @RequestMapping("/calc")

    public String arvuta(Double a, @Nullable Double b, Double x1, Double x2) {

        // a = kordaja
        // b = vabaliige
        JoonKlass joonKlass1 = new JoonKlass(a);
        JoonKlass2 joonKlass2 = new JoonKlass2(a, 0);

        String y = "y = ";
        int c = 1;
        double[] x = new double[x2.intValue()];

        for (int i = 0; i < x2; i++) {
            x[i] = c;
            c++;
        }

        if (b == null) {
            y = y + Arrays.toString(FunctionJoon(x, joonKlass1));
        } else {
            joonKlass2.vabaliige = b;
            y = y + Arrays.toString(FunctionJoon(x, joonKlass2));
        }

        return y;
    }

    public static void main(String[] args) {
        SpringApplication.run(JoonApplication.class, args);
    }
}
