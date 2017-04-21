public class Toidukomponent{

	Toiduaine toiduaine;
	double kogus;
	double rasvakoguse_arvutaja(){
		return (kogus*toiduaine.rasvade_protsent)/100;
	}
}
