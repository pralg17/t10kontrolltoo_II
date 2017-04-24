package sten;

import javax.persistence.*;

@Table(name="Salat")
@Entity
public class Salat{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String nimetus;
	public Integer kogus;
	public Integer rasvaprotsent;
	public Integer sysivesikuprotsent;
	public Integer valguprotsent;
	public Integer rasvakogus;
	
	
	public Salat(){
 		
 	}

 	public Salat(String nimetus, Integer kogus, Integer rasvakogus, Integer rasvaprotsent, Integer sysivesikuprotsent, Integer valguprotsent){
		this.nimetus = nimetus;
		this.kogus = kogus;
		this.rasvakogus = rasvakogus;
		this.rasvaprotsent = rasvaprotsent;
		this.sysivesikuprotsent = sysivesikuprotsent;
		this.valguprotsent = valguprotsent;
	}	
 	
}