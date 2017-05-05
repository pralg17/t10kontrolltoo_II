package ege;

import javax.persistence.*;

@Table(name="J6ed")
@Entity
public class J6edEntity{
	@Id
	@Column(name = "nimetus", nullable = false)
	public String nimetus;
	public Double pikkus;
	public Double vooluhulk;
	public String sihtj6gi = null;
	public Double sihtj6eAsukoht = null;
	
	public J6edEntity(){
		
	}
	
	public J6edEntity(String nimetus, Double pikkus, Double vooluhulk){
		this.nimetus = nimetus;
		this.pikkus = pikkus;
		this.vooluhulk = vooluhulk;
	}
	
	public J6edEntity(String nimetus, Double pikkus, Double vooluhulk, String sihtj6gi, Double sihtj6eAsukoht){
		this.nimetus = nimetus;
		this.pikkus = pikkus;
		this.vooluhulk = vooluhulk;
		this.sihtj6gi=sihtj6gi;
		this.sihtj6eAsukoht=sihtj6eAsukoht;
	}
}