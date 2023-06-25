package org.crm.auto.dealership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "countries")
@Data
@EqualsAndHashCode
public class Country extends AbstractEntity {
  @Column(name = "")
  private String name;
}
