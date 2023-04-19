package com.tim.springbootmall.service.ProductServiceImpl;

import com.tim.springbootmall.dao.ProductDao;
import com.tim.springbootmall.model.Product;
import com.tim.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
