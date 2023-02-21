package org.crm.auto.dealership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.crm.auto.dealership.common.enums.OrderStatus;

@Entity
@Table(name = "orders")
@Data
@EqualsAndHashCode
public class Order extends AbstractEntity {

  @Column(name = "order_date")
  private LocalDateTime orderDate;

  @ManyToOne
  private User customer;

  @ManyToMany(mappedBy = "orders")
  private List<Car> car;

  @ManyToOne
  private User seller;

  @Column(name = "status")
  private OrderStatus status;

  @Column(name = "deliveryDate")
  private LocalDateTime deliveryDate;

  @Column(name = "comments")
  private String comments;
}
