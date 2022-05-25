package localhost.sharedRepository.models;

import javax.persistence.Entity;

@Entity
public class Entity1 extends AbstractEntity {

  private String name;

  public Entity1() {
  }

  public Entity1(Long id, String name) {
    this.setId(id);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Entity1{" +
        "id='" + getId() + '\'' +
        "name='" + name + '\'' +
        '}';
  }
}
