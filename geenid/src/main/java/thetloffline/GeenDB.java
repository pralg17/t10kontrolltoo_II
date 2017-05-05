package thetloffline;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="geenid")
public class GeenDB {
	@Id public int id;
	public String alleeliNimetus;
	public String lapseAlleel1;
	public String lapseAlleel2;

	@Override
	public String toString() {
	  	return "geen: " + alleeliNimetus + ", alleel 1: " + lapseAlleel1 + ", alleel 2: " + lapseAlleel2;
	}

	
}
