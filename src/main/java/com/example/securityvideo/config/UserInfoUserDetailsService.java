package com.example.securityvideo.config;

import com.example.securityvideo.bean.entity.UserInfo;
import com.example.securityvideo.dao.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> byAccount = userInfoRepository.findByAccount(username);
        return byAccount.map(UserInfoUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("not found user"));
    }
}
