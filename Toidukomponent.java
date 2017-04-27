public class Toidukomponent{
	
	Toiduaine t;
	double kogus;
	
	double rasvakogus(){
		return (kogus*t.rasvade_p)/100;
	}
	
	double valkudekogus(){
		return (kogus*t.valkude_p)/100;
	}
	
	double sysivesikutekogus(){
		return (kogus*t.sysivesikute_p)/100;
	}
}