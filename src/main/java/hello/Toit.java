package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "toiduained") //oli user
public class Toit {
	@Id
	@GeneratedValue
	Integer id;
	String nimetus;
	Integer valgud;
	Integer rasvad;
	Integer sysivesikud;

	@Override
	public String toString() {
		return "<tr><td>" + id + "</td><td>" + nimetus + "</td><td>" + valgud + "</td><td>" + rasvad + "</td><td>"+ sysivesikud;
	}
}