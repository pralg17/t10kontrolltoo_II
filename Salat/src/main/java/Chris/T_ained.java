package Chris;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;


@Entity
@Table(name="toiduained")
public class T_ained{
  @Id
  @GeneratedValue
  public Integer id;
  public String nimetus;
  public double valgud;
  public double rasvad;
  public double sysivesikud;
  
	public T_ained(){
		
	}


	public T_ained(Integer id, String nimetus, double valgud, double rasvad, double sysivesikud){
	
		this.id = id;
		this.nimetus = nimetus;
		this.valgud = valgud;
		this.rasvad = rasvad;
		this.sysivesikud = sysivesikud;
	
	}
	
	public String p_error(){
	
		return "Rasvade, valkude ja sysivesikute protsent ei tohi yletada arvu 100";
	
	}
}