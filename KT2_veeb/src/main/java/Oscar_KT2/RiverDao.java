package Oscar_KT2;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface RiverDao extends CrudRepository<River, Long> {
   public River findByRivername(String rivername);
   public River findByWhereflows(String whereflows);
}