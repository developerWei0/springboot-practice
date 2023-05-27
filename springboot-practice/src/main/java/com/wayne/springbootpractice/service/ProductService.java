package com.wayne.springbootpractice.service;

import com.wayne.springbootpractice.dto.ProductRequest;
import com.wayne.springbootpractice.model.Product;
import org.springframework.stereotype.Component;


public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId , ProductRequest productRequest);
}
