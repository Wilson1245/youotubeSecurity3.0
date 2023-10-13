package com.example.securityvideo.service;

import com.example.securityvideo.bean.entity.Product;
import com.example.securityvideo.bean.request.ProductRequest;
import com.example.securityvideo.bean.request.update.UpdateProductRequest;
import com.example.securityvideo.dao.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found product"));
    }

    public Product insert(ProductRequest request) {
        Product product = request.toEntity();
        return productRepository.save(product);
    }

    public Product update(Long productId, UpdateProductRequest request) {
        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found product"));
        Product entity = request.toEntity(product);
        return productRepository.save(entity);
    }

    public void remove(Long productId) {
        productRepository.deleteById(productId);
    }
}
