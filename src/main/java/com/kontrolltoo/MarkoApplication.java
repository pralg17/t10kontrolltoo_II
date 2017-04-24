package com.kontrolltoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = SessionAutoConfiguration.class)
@RestController
public class MarkoApplication {
	public IoonRakendamine vesinik = new IoonRakendamine("H", 12.0, 1);
    public IoonRakendamine nitraat = new IoonRakendamine("NO3", 62, -1 );
	public Aine vesiniknitraat = new AineRakendamine(vesinik, nitraat);


    public static void main(String[] args) {
        SpringApplication.run(MarkoApplication.class, args);

    }
}
