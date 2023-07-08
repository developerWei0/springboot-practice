package com.wayne.springbootpractice.service;

import com.wayne.springbootpractice.dto.CreateOrderRequest;
import com.wayne.springbootpractice.model.Order;

public interface OrderService {

    Order getOrderByid(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
