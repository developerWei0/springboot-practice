package com.wayne.springbootpractice.service.impl;

import com.wayne.springbootpractice.dao.ProductDao;
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
}
