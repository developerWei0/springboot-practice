package com.wayne.springbootpractice.dao;

import com.wayne.springbootpractice.dto.ProductRequest;
import com.wayne.springbootpractice.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductDao {

    List<Product> getProducts();
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId , ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
