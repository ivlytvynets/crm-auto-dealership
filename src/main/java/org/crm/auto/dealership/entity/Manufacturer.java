package org.crm.auto.dealership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "manufacturers")
@Data
@EqualsAndHashCode
public class Manufacturer extends AbstractEntity {
  @Column(name = "name")
  private String name;

  @ManyToOne
  @JoinColumn(name = "country_id")
  private Country country;
}
