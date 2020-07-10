package com.zhangwei.dao;

import com.zhangwei.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    List<User> selectAll();
}
