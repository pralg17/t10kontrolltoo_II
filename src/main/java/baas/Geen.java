package baas;

import javax.persistence.*;

@Entity
@Table(name="geen1")
public class Geen{

	@Id
  @GeneratedValue
  public  Integer id;
	@ManyToOne
  @JoinColumn(name = "alleel1")
  public  Alleel alleel1;

  @ManyToOne
  @JoinColumn(name = "alleel2")
  public Alleel alleel2;

	public Geen(){}

	public Geen(Alleel alleel1, Alleel alleel2){
		if(alleel1.getNimetus().equals(alleel2.getNimetus())){
			this.alleel1 = alleel1;
			this.alleel2 = alleel2;
		}
	}

	public boolean Kontroll(){
		if(alleel1.isPositiivne() || alleel2.isPositiivne()){
			return true;
		}else{
			return false;
		}
	}

	public Integer getId(){
		return id;
	}

	public Alleel getAlleel1(){
		return alleel1;
	}

	public Alleel getAlleel2(){
		return alleel2;
	}

	public Alleel juhuslik(){
	    if(Math.random() < 0.5) {
	    	return alleel1;
	    }else{
				 return alleel2;
			}
	}

	public Geen (Geen geen_esimene, Geen geen_teine){
		if(geen_esimene.getAlleel1().getNimetus().equals(geen_teine.getAlleel1().getNimetus())){
			this.alleel1 = geen_esimene.juhuslik();
			this.alleel2 = geen_teine.juhuslik();
    }
	}
	@Override
	public String toString() {
		return "Geen [alleel1=" + alleel1 + ", alleel2=" + alleel2 + "]";
	}

	public static void main(String[] args){
		Alleel a1 = new Alleel("Nimetus1", true);
		Alleel a2 = new Alleel("Nimetus1", true);
		Alleel a3 = new Alleel("Nimetus1", false);
		Geen geen1 = new Geen(a1, a2);
		Geen geen2 = new Geen(a1, a3);
		System.out.println(geen1.Kontroll());
		System.out.println(geen2.Kontroll());
		Geen geen3 = new Geen(geen1, geen2);
		System.out.println(geen3);

	}

}
