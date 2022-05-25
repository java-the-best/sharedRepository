package localhost.sharedRepository.service;

import localhost.sharedRepository.models.Entity1;
import localhost.sharedRepository.repo.Entity1Repo;
import org.springframework.stereotype.Service;

@Service
public class Entity1Service extends CommonService<Entity1, Entity1Repo> {

  public Entity1Service(Entity1Repo repo) {
    super(repo);
  }
}
