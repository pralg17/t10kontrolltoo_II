package baas;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="alleel1")
public class Alleel{
	@Id
  @GeneratedValue
  private Integer id;
	public String nimetus;
	public boolean positiivne;

	public Alleel(String nimetus, boolean positiivne){
		this.nimetus = nimetus;
		this.positiivne = positiivne;
	}

	public Alleel(){}

	public String getNimetus(){
		return nimetus;
	}

	public Integer getId(){
		return id;
	}

	public boolean isPositiivne(){
		return positiivne;
	}

	@Override
	public String toString() {
		return "Alleel [nimetus=" + nimetus + ", positiivne=" + positiivne + "]";
	}

}
