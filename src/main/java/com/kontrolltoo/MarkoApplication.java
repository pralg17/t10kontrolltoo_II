package com.kontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@SpringBootApplication (exclude = SessionAutoConfiguration.class)
@RestController

public class MarkoApplication{

	@Autowired
	HttpSession sessioon;
	ArrayList<String> nameArray = new ArrayList<>();

	public IoonRakendamine vesinik = new IoonRakendamine("H", 12.0, 1);
	public IoonRakendamine nitraat = new IoonRakendamine("(NO3)", 62, -1);
	public IoonRakendamine kloor = new IoonRakendamine("Cl", 8, -3);
	public IoonRakendamine floriid = new IoonRakendamine("F", 17, -1);

	public Aine vesinikfloriid = new AineRakendamine(floriid, vesinik);
	public Aine vesiniknitraat = new AineRakendamine(vesinik, nitraat);

	public AineRakendamine_massiiv massiv = new AineRakendamine_massiiv(vesinik, vesinik, vesinik, kloor);

	@RequestMapping ("/failure")
	public String makeFailure() {
		try{
			Aine failure = new AineRakendamine(vesinik, kloor);
		}catch ( RuntimeException e ){
			return "You don goofed";
		}
		return null;
	}

	@RequestMapping ("ionarray")
	public String ionname() {
		return massiv.getName();
	}

	@RequestMapping ("sessionion")
	public void ionToSession(String name, int charge, int atommass) {
		sessioon.setAttribute(name, new IoonRakendamine(name, atommass, charge));
		nameArray.add(name);
	}


	public static void main(String[] args) {
		SpringApplication.run(MarkoApplication.class, args);

	}
}
