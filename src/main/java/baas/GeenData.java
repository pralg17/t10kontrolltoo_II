package baas;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface GeenData extends CrudRepository<Geen, Integer>{

}
