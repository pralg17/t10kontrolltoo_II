package com.kontrolltoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = SessionAutoConfiguration.class)
@RestController
public class MarkoApplication {
    Ioon vesinik = new IoonRakendus("H", 12.0, 1);
    Ioon nitraat = new IoonRakendus("NO3", 62, -1 );

    @RequestMapping("/vesinik/laeng")
    public int getLaeng(){
        return vesinik.getLaeng();
    }


    public static void main(String[] args) {
        SpringApplication.run(MarkoApplication.class, args);

    }
}
