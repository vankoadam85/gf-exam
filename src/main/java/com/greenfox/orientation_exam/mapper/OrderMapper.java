package com.greenfox.orientation_exam.mapper;

import com.greenfox.orientation_exam.dto.OrderDTO;
import com.greenfox.orientation_exam.dto.OrderDetailsResponseDTO;
import com.greenfox.orientation_exam.entity.Order;

public interface OrderMapper {

  Order DTOToEntity(OrderDTO orderDTO);

  OrderDetailsResponseDTO entityToDetailsResponseDTO(Order order);

}
