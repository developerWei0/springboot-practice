package com.wayne.springbootpractice.service;

import com.wayne.springbootpractice.dto.CreateOrderRequest;
import com.wayne.springbootpractice.dto.OrderQueryParams;
import com.wayne.springbootpractice.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderByid(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
