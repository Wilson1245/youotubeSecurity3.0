package com.example.securityvideo.bean.request.update;

import com.example.securityvideo.bean.entity.Product;
import lombok.Data;

import java.util.Objects;

@Data
public class UpdateProductRequest {

    private String name;

    private Integer price;

    private Integer qty;

    public Product toEntity(Product product) {
        if (Objects.nonNull(this.name))
            product.setName(this.name);
        if (Objects.nonNull(this.price))
            product.setPrice(this.price);
        if (Objects.nonNull(this.qty))
            product.setQty(this.qty);
        return product;
    }
}
