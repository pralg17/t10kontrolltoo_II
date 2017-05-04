package henri;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ManageTable extends CrudRepository<Toiduained, Long> {
	List<Toiduained> findByNimetus(String nimetus);
}