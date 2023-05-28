package com.wayne.springbootpractice.dao;

import com.wayne.springbootpractice.dto.ProductRequest;
import com.wayne.springbootpractice.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId , ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
