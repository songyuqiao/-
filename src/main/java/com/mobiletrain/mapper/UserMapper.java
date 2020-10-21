package com.mobiletrain.mapper;

import com.mobiletrain.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> queryByUsernameAndPassword(@Param("username") String username , @Param("password") String password);
}
