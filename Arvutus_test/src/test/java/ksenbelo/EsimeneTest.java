package ksenbelo;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	
	@Test
	public void test1(){
		
		Jogi jogi1= new Jogi();
		jogi1.nimetus = "Suur-jogi";
		jogi1.pikkus = 500;
		Jogi jogi2= new Jogi();
		jogi2.nimetus = "Vaike-jogi";
		jogi2.pikkus = 120;
		
		double vastus1= jogi1.pikkus + jogi2.pikkus;
		System.out.println(vastus1);
		double vastus2= jogi1.pikkus - jogi2.pikkus;
		System.out.println(vastus2);
		double vastus3= jogi1.pikkus;
		System.out.println(vastus3);
	}
	
}

/*
Running ksenbelo.EsimeneTest
620.0
380.0
500.0
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 sec - in ksenbelo.EsimeneTest

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
*/