package ee.tlu.if16.jaagup;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
@Transactional
public interface TabeliHaldur extends CrudRepository<Toiduained, Integer> {


}
