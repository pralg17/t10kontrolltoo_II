package ee.tlu.if16.jaagup;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "toiduained")
public class Toiduained {
	@Id
    @GeneratedValue
	Integer id;
	String toiduaine_nimetus;
	Integer valgud_protsent;
	Integer rasvad_protsent;
	Integer sysivesikud_protsent;

	public String protsendiError(){
       String error = "Valkude, rasvade ja susivesikute protsent ei tohi kokku uletada 100%";
       return error;
   }
	@Override
    public String toString() {
        return "<tr><td>" + id + "</td><td>" + toiduaine_nimetus + "</td><td>" + valgud_protsent + "</td><td>" + rasvad_protsent +
		"</td><td>" + sysivesikud_protsent + "</td><td>";
    }

//
		}
