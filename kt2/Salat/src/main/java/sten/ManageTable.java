package sten;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ManageTable extends CrudRepository<Salat, Long> {
	List<Salat> findBynimetus(String nimetus);
}