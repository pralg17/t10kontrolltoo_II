public class Toiduained{
	String nimetus;
	double valgud;
	double rasvad;
	double susivesikud;

	public Toiduained(String nimetus, double valgud, double rasvad, double susivesikud){
		if(nimetus==null || nimetus.length()==0){
            throw new RuntimeException("Nimetus puudub");
        }

		this.nimetus = nimetus;
		this.valgud = valgud;
		this.rasvad = rasvad;
		this.susivesikud = susivesikud;

		if(valgud + rasvad + susivesikud >100){
			throw new RuntimeException("Protsent kokku ei saa uletada 100!");
		}
	}
}
