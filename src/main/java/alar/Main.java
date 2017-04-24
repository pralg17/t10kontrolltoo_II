package alar;

import org.springframework.boot.SpringApplication;

/**
 * Created by Alar Aasa on 20.04.2017.
 */
public class Main {
    public static void main(String[] args){
        System.getProperties().put("server.port", 4889);
        SpringApplication.run(Application.class, args);
    }
}
