package com.mobiletrain.mapper;

import com.mobiletrain.domain.Order;
import com.mobiletrain.domain.User;

import java.util.List;

public interface OrderMapper {

    List<User> queryAll();

    Order queryById(int id);

    int delete(int id);
}
