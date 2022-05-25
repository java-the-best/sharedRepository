package localhost.sharedRepository.repo;

import localhost.sharedRepository.models.AbstractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepo<E extends AbstractEntity> extends CrudRepository<E, Long> {
}
