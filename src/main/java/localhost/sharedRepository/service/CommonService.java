package localhost.sharedRepository.service;

import com.google.common.collect.Lists;
import java.util.List;
import localhost.sharedRepository.models.AbstractEntity;
import localhost.sharedRepository.repo.CommonRepo;

public abstract class CommonService<E extends AbstractEntity, R extends CommonRepo<E>> {

  protected final R repo;

  public CommonService(R repo) {
    this.repo = repo;
  }

  public void save(E e) {
    repo.save(e);
  }

  public List<E> findAll() {
    return Lists.newArrayList(repo.findAll());
  }
}
