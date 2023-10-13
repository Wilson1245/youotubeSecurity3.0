package com.example.securityvideo.service;

import com.example.securityvideo.bean.entity.UserInfo;
import com.example.securityvideo.bean.request.UserInfoRequest;
import com.example.securityvideo.dao.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    private final PasswordEncoder passwordEncoder;

    public UserInfo insert(UserInfoRequest request) {
        UserInfo entity = request.toEntity();
        entity.setPassword(passwordEncoder.encode(request.getPassword()));
        return userInfoRepository.save(entity);
    }
}
