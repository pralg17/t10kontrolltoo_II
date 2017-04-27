package karolmilaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "toiduained")
public class Toiduained{
	@Id
    @GeneratedValue
	Integer id;
	String nimetus;
	Integer valgud;
	Integer rasvad;
	Integer susivesikud;

	public String protsendiError(){
       String error = "Valkude, rasvade ja susivesikute protsent ei tohi kokku uletada 100%";
       return error;
   }
	@Override
    public String toString() {
        return "<tr><td>" + id + "</td><td>" + nimetus + "</td><td>" + valgud + "</td><td>" + rasvad +
		"</td><td>" + susivesikud + "</td><td>";
    }

	/*public Toiduained(String nimetus, double valgud, double rasvad, double susivesikud){
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
	} */
}
