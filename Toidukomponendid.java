public class Toidukomponendid{
	Toiduaine t;
    double kogus;
	double rasvakogus(){
		if(t==null){return kogus;}
		return kogus*t.rasvaprotsent;
	}
}