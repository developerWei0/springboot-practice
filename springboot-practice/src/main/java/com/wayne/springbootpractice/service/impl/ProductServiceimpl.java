package com.wayne.springbootpractice.service.impl;

import com.wayne.springbootpractice.dao.ProductDao;
import com.wayne.springbootpractice.dto.ProductRequest;
import com.wayne.springbootpractice.model.Product;
import com.wayne.springbootpractice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public Product getProductById(Integer productId){
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
