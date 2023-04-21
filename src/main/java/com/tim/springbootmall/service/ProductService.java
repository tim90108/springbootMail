package com.tim.springbootmall.service;

import com.tim.springbootmall.constant.ProductCategory;
import com.tim.springbootmall.dto.ProductRequest;
import com.tim.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Integer productId);

    List<Product> getProducts(ProductCategory category, String search);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
