package com.news.mapper;

import com.news.pojo.User;

public interface UserMapper {
    Integer emailExist(String email);
    void regsitry(User user);
}