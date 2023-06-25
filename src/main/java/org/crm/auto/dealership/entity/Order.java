package org.crm.auto.dealership.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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

  @Column(name = "customer_email")
  private String customerEmail;

  @ManyToMany(mappedBy = "orders")
  private List<Car> car;

  @Column(name = "seller_email")
  private String sellerEmail;

  @Column(name = "status")
  private OrderStatus status;

  @Column(name = "deliveryDate")
  private LocalDateTime deliveryDate;

  @Column(name = "comments")
  private String comments;
}
