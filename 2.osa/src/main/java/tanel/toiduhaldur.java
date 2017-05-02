package tanel;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
@Transactional
public interface toiduhaldur extends CrudRepository<toit, String> {

    //toit save(String nimetus, int valk, int rasv, int sysivesik);
}