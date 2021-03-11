package com.axiang.service;

import com.axiang.po.User;

public interface UserService {
    User checkUser(String username,String password);
}
