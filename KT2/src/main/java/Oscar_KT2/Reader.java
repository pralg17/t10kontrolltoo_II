package Oscar_KT2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="river")
public class Reader{
  @Id
  public String riverName;
  public double riverFlow;
  public River s;
  public double riverLenght;
}