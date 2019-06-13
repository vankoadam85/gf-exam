package com.greenfox.orientation_exam.controller;

import com.greenfox.orientation_exam.dto.OrderDTO;
import com.greenfox.orientation_exam.entity.Order;
import com.greenfox.orientation_exam.exception.OrderNotFoundException;
import com.greenfox.orientation_exam.mapper.OrderMapper;
import com.greenfox.orientation_exam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private OrderMapper orderMapper;
  private OrderService orderService;

  @Autowired
  MainController(OrderMapper orderMapper, OrderService orderService) {
    this.orderMapper = orderMapper;
    this.orderService = orderService;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("orderDTO", new OrderDTO());
    return "index";
  }

  @PostMapping("/order")
  public String saveOrder(OrderDTO orderDTO) {
    Order order = orderService.saveOrder(orderMapper.DTOToEntity(orderDTO));
    return"redirect:/order/" + order.getId();
  }

  @GetMapping("/order/{orderId}")
  public String orderSummary(@PathVariable long orderId, Model model) {
    model.addAttribute("order", orderService.getOrderById(orderId).orElseThrow(OrderNotFoundException::new));
    return "orderDetails";
  }

}
