package baas;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="kasutajad")
public class Kasutaja{
	@Id
	public String kasutajanimi;
	public float saldo;
	@OneToMany(mappedBy="maksja")
	Set<arve> arved;
}
