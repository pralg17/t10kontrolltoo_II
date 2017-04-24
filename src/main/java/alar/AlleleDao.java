package alar;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Alar Aasa on 20.04.2017.
 */

@Transactional
public interface AlleleDao extends CrudRepository<Allele, String> {
}

