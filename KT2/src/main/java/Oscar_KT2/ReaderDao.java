package Oscar_KT2;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface ReaderDao extends CrudRepository<Reader, Long> {
   //public Lugeja findByEmail(String email);
}