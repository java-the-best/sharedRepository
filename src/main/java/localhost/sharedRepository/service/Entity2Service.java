package localhost.sharedRepository.service;

import localhost.sharedRepository.models.Entity2;
import localhost.sharedRepository.repo.Entity2Repo;
import org.springframework.stereotype.Service;

@Service
public class Entity2Service extends CommonService<Entity2, Entity2Repo> {

  public Entity2Service(Entity2Repo repo) {
    super(repo);
  }
}
