package com.greenfox.orientation_exam.service;

import com.greenfox.orientation_exam.entity.Order;

import java.util.Optional;

public interface OrderService {

  Order saveOrder(Order order);

  Optional<Order> getOrderById(long id);

  Iterable<Order> getAllOrdersByStatus(String status);

  Iterable<Order> getAllOrdersByStatusAndTopping(String status, String topping);

}
