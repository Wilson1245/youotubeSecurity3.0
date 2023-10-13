package com.example.securityvideo.bean.request;

import com.example.securityvideo.bean.entity.UserInfo;
import lombok.Data;

@Data
public class UserInfoRequest {

    private String account;

    private String password;

    private String name;

    private Integer age;

    /**
     * ROLE_USER
     */
    private String roles;

    public UserInfo toEntity() {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(this.account);
        userInfo.setPassword(this.password);
        userInfo.setName(this.name);
        userInfo.setAge(this.age);
        userInfo.setRoles(this.roles);
        return userInfo;
    }
}
