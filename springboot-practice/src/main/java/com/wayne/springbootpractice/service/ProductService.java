package com.wayne.springbootpractice.service;

import com.wayne.springbootpractice.dao.ProductQueryParams;
import com.wayne.springbootpractice.dto.ProductRequest;
import com.wayne.springbootpractice.model.Product;

import java.util.List;


public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId , ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
