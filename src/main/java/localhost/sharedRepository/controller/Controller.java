package localhost.sharedRepository.controller;

import localhost.sharedRepository.models.Entity1;
import localhost.sharedRepository.models.Entity2;
import localhost.sharedRepository.repo.Entity1Repo;
import localhost.sharedRepository.repo.Entity2Repo;
import localhost.sharedRepository.service.CommonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  CommonService<Entity1, Entity1Repo> service1;
  CommonService<Entity2, Entity2Repo> service2;

  public Controller(
      CommonService<Entity1, Entity1Repo> service1,
      CommonService<Entity2, Entity2Repo> service2) {
    this.service1 = service1;
    this.service2 = service2;
  }

  @GetMapping
  public String index() {
    Entity1 entity1 = new Entity1(1L, "Дмитрий");
    service1.save(entity1);
    StringBuilder sb = new StringBuilder(service1.findAll().toString());

    Entity2 entity = new Entity2(1L, "Рабочий");
    service2.save(entity);
    sb.append(service2.findAll().toString());
    return sb.toString();
  }
}
