package baas;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface AlleelData extends CrudRepository<Alleel, Integer>{

}
