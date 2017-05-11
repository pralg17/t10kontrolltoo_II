package Rait;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface JoedDao extends CrudRepository<Joed, String> {}