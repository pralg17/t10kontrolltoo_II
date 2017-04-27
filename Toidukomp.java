public class Toidukomp{
	Toiduained t;
    double kogus;
	double rasvakogus(){
		if(t==null){return kogus;}
		return (kogus*t.rasvaprotsent)/100;
	}
}
