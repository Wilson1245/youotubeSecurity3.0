package com.example.securityvideo.controller;

import com.example.securityvideo.bean.entity.Product;
import com.example.securityvideo.bean.request.ProductRequest;
import com.example.securityvideo.bean.request.update.UpdateProductRequest;
import com.example.securityvideo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@EnableMethodSecurity
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/info/{productId}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Product findById(@PathVariable Long productId) {
        return productService.findById(productId);
    }

    @PostMapping
    public Product insert(@RequestBody ProductRequest request) {
        return productService.insert(request);
    }

    @PutMapping("/{productId}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Product update(@PathVariable Long productId, @RequestBody UpdateProductRequest request) {
        return productService.update(productId, request);
    }

    @DeleteMapping("/{productId}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void remove(@PathVariable Long productId) {
        productService.remove(productId);
    }
}
