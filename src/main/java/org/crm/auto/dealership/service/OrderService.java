package org.crm.auto.dealership.service;

import lombok.RequiredArgsConstructor;
import org.crm.auto.dealership.common.enums.OrderStatus;
import org.crm.auto.dealership.entity.Order;
import org.crm.auto.dealership.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
  private final OrderRepository orderRepository;

  public Order save(Order order) {
    order.setStatus(OrderStatus.DRAFT);
    return orderRepository.save(order);
  }

  public Order submit(Order order) {
    order.setStatus(OrderStatus.SUBMITTED);
    return orderRepository.save(order);
  }

  public Order complete(Order order) {
    order.setStatus(OrderStatus.COMPLETED);
    return orderRepository.save(order);
  }

  public Order update(Order order) {
    return orderRepository.save(order);
  }

  public void deleteById(Long id) {
    orderRepository.deleteById(id);
  }

  public void deleteAll() {
    orderRepository.deleteAll();
  }
}
