package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "toiduained")
public class Toit {
	@Id
	@GeneratedValue
	Integer id;
	String nimetus;
	Integer valgud;
	Integer rasvad;
	Integer sysivesikud;

	public Toit() {
	//tühi konstruktor et saaks veebilehelt ligi
	}

	public Toit(Integer id, String nimetus, Integer valgud, Integer rasvad, Integer sysivesikud) {
		this.id = id;
		this.nimetus = nimetus;
		this.valgud = valgud;
		this.rasvad = rasvad;
		this.sysivesikud = sysivesikud;
	}


		@Override
	public String toString() {
		return "<tr><td>" + id + "</td><td>" + nimetus + "</td><td>" + valgud + "</td><td>" + rasvad + "</td><td>"+ sysivesikud;
	}
}