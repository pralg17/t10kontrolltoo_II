package ege;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ManageTable extends CrudRepository<J6edEntity, String>{
	List<J6edEntity> findByNimetus(String nimetus);
}