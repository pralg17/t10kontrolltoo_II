package thetloffline;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface GeenDao extends CrudRepository<GeenDB, String> {
   //public GeenidDB findByGeneName(String alleeliNimetus);
}