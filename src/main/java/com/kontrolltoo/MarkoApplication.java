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
	private HttpSession sessioon;
	private ArrayList<String> nameArray = new ArrayList<>();
	private ArrayList<IoonRakendamine> helper = new ArrayList<IoonRakendamine>();

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

	@RequestMapping ("createsubstance")
	public String makeSubstance() {
		for( String ion_name : nameArray ){
			helper.add((IoonRakendamine) sessioon.getAttribute(ion_name));
		}

		try{

			if(helper.isEmpty() && nameArray.isEmpty()){
				return "Lisage ioonid";
			}else{
				AineRakendamine_massiiv aine = new AineRakendamine_massiiv(helper.toArray(new IoonRakendamine[0]));
				helper.clear();
				nameArray.clear();
				return aine.getName() + " aatommassiga: " + aine.giveMass();
			}


		}catch ( RuntimeException e ){
			helper.clear();
			nameArray.clear();
			return "Ainete laeng ei ole 0. Alustage algusest.";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(MarkoApplication.class, args);

	}
}
