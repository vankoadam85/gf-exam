package com.greenfox.orientation_exam.service;

import com.greenfox.orientation_exam.entity.Order;
import com.greenfox.orientation_exam.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;

  @Autowired
  OrderServiceImpl(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public Order saveOrder(Order order) {
    orderRepository.save(order);
    return order;
  }

  public Optional<Order> getOrderById(long id) {
    return orderRepository.findById(id);
  }

  public Iterable<Order> getAllOrdersByStatus(String status) {
    return orderRepository.findAllByStatus(status);
  }

  public Iterable<Order> getAllOrdersByStatusAndTopping(String status, String topping) {
    return orderRepository.findAllByStatusAndTopping(status, topping);
  }

}
