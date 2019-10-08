package com.fan3bian.toad.mapper;

import com.fan3bian.toad.domain.entity.User;

import java.util.List;

public interface UserMapper {
    int insert(User user);

    List<User> getAll();

    int countByUsername(String username);

    User getUser(Long id);
}
