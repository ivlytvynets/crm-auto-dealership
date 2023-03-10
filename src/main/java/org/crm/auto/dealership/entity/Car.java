package org.crm.auto.dealership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.crm.auto.dealership.common.enums.BodyType;
import org.crm.auto.dealership.common.enums.EquipmentType;

@Entity
@Table(name = "cars")
@Data
@EqualsAndHashCode
public class Car extends AbstractEntity {

  @ManyToOne
  @JoinColumn(name = "manufacturer_id")
  private Manufacturer manufacturer;

  @Column(name = "model")
  private String model;

  @Column(name = "body_type")
  private BodyType bodyType;

  @Column(name = "equipment_type")
  private EquipmentType equipmentType;

  @Column(name = "release_year")
  private Integer releaseYear;

  @Column(name = "price")
  private BigDecimal price;

  @ManyToMany
  @JoinTable(name = "cars_orders",
      joinColumns = @JoinColumn(name = "car_id"),
      inverseJoinColumns = @JoinColumn(name = "order_id"))
  private List<Order> orders;
}
