package henri;

import javax.persistence.*;

@Table(name="Toiduained")
@Entity
public class Toiduained{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String nimetus;
	public Integer kogus;
	public Integer sysivesikuprotsent;
	public Integer valguprotsent;
	public Integer rasvakogus;
	
	
	public Toiduained(){
 		
 	}

 	public Toiduained(String nimetus, Integer kogus, Integer rasvakogus, Integer sysivesikuprotsent, Integer valguprotsent){
		this.nimetus = nimetus;
		this.kogus = kogus;
		this.rasvakogus = rasvakogus;
		this.sysivesikuprotsent = sysivesikuprotsent;
		this.valguprotsent = valguprotsent;
	}	
 	
}