package com.greenfox.orientation_exam.repository;

import com.greenfox.orientation_exam.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

  Iterable<Order> findAllByStatus(String status);

  Iterable<Order> findAllByStatusAndTopping(String status, String topping);

}
