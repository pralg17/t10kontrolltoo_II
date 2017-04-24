package Chris;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="toiduained")
public class T_ained{
  @Id
  public int id;
  public String nimetus;
  public double valgud;
  public double rasvad;
  public double sysivesikud;
}