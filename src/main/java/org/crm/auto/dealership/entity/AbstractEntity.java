package org.crm.auto.dealership.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public abstract class AbstractEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Override
  public int hashCode() {
    if (id != null) {
      return id.hashCode();
    }
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof AbstractEntity other)) {
      return false;
    }

    if (id != null) {
      return id.equals(other.id);
    }
    return super.equals(other);
  }
}