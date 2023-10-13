package com.example.securityvideo.controller;

import com.example.securityvideo.bean.entity.Product;
import com.example.securityvideo.bean.entity.UserInfo;
import com.example.securityvideo.bean.request.UserInfoRequest;
import com.example.securityvideo.service.ProductService;
import com.example.securityvideo.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/index")
@RequiredArgsConstructor
public class IndexController {

    private final UserInfoService userInfoService;

    private final ProductService productService;

    @GetMapping
    public String index() {
        return "Welcome";
    }

    @GetMapping("/product")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/register")
    public UserInfo insert(@RequestBody UserInfoRequest request) {
        return userInfoService.insert(request);
    }
}
