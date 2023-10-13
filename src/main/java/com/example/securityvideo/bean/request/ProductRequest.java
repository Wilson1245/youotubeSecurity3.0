package com.example.securityvideo.bean.request;

import com.example.securityvideo.bean.entity.Product;
import lombok.Data;

@Data
public class ProductRequest {

    private String name;

    private Integer price;

    private Integer qty;

    public Product toEntity() {
        Product product = new Product();
        product.setName(this.name);
        product.setPrice(this.price);
        product.setQty(this.qty);
        return product;
    }
}
