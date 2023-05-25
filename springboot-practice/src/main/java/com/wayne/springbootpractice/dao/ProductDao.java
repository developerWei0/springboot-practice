package com.wayne.springbootpractice.dao;

import com.wayne.springbootpractice.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDao {
    Product getProductById(Integer productId);
}
