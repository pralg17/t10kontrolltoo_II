package Rait;

import javax.persistence.*;

@Entity
@Table(name="joed")

public class Joed {
	@Id
	public String nimi;
	public double pikkus;
	public double vooluhulk;
	public String sihtjogi;
	public int suubub;

}