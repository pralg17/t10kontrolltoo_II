package thetloffline;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface GeenideHaldur extends CrudRepository<GeenidDB, String> {
   //public GeenidDB findByGeneName(String uusGeen); // kas String või Geen?
}