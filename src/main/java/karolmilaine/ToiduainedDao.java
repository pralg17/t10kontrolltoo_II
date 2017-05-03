package karolmilaine;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ToiduainedDao extends CrudRepository<Toiduained, Integer> {

}