package thetloffline;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="geenid")
public class GeenidDB {
  @Id public Integer id;
  public String alleeliNimetus;
  public String lapseAlleel1;
  public String lapseAlleel2;


  //kas see sobib random geeni tagastamiseks??
}