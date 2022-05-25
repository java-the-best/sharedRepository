package localhost.sharedRepository.models;

import javax.persistence.Entity;

@Entity
public class Entity2 extends AbstractEntity {

  private String type;

  public Entity2() {
  }

  public Entity2(Long id, String type) {
    this.setId(id);
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Entity1{" +
        "id='" + getId() + '\'' +
        "type='" + type + '\'' +
        '}';
  }
}
