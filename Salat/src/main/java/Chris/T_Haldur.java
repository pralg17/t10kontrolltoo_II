package Chris;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface T_Haldur extends CrudRepository<T_ained, Integer> {
}