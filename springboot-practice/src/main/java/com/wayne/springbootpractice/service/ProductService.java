package com.wayne.springbootpractice.service;

import com.wayne.springbootpractice.model.Product;
import org.springframework.stereotype.Component;


public interface ProductService {
    Product getProductById(Integer productId);
}
