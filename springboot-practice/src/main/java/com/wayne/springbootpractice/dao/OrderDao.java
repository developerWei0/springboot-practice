package com.wayne.springbootpractice.dao;

import com.wayne.springbootpractice.dto.OrderQueryParams;
import com.wayne.springbootpractice.model.Order;
import com.wayne.springbootpractice.model.OrderItem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
