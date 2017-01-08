package com.github.zjulzq.dao;

import com.github.zjulzq.entity.User;

public interface UserDao {
    void add(User user);

    User query(String username);

    void remove(User user);

    void update(User user);
}
