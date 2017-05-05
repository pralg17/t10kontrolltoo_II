package heino;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "toiduained")
 public class Toiduained {
	@Id
    @GeneratedValue
			public Integer id;
			public String toiduaine_nimetus;
			public double valgud_protsent;
			public double rasvad_protsent;
			public double sysivesikud_protsent;

//loomine
	public Toiduained(){

	}

//Meetod avalikele muutujatele väärtuste andmiseks
	public Toiduained(Integer id, String toiduaine_nimetus, double valgud_protsent, double rasvad_protsent, double sysivesikud_protsent) {
			this.id = id;
			this.toiduaine_nimetus = toiduaine_nimetus;
			this.valgud_protsent = valgud_protsent;
			this.rasvad_protsent = rasvad_protsent;
			this.sysivesikud_protsent = sysivesikud_protsent;

	}

	public String protsendiError(){

       String error = "Valkude, rasvade ja susivesikute protsent ei tohi kokku uletada 100%";

	return error;
   }

	 // return String representation of SalariedEmployee object
@Override
	 public String toString() {

	 return "<tr><td>" + id + "</td><td>" + toiduaine_nimetus + "</td><td>" + valgud_protsent + "</td><td>" + rasvad_protsent +
			"</td><td>" + sysivesikud_protsent + "</td><td>";
	    }

//
		}
