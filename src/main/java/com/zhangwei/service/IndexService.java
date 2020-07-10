package com.zhangwei.service;

import com.zhangwei.dao.UserDAO;
import com.zhangwei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {
    public List<User> getUserAll() {
        return userDAO.selectAll();
    }

    @Autowired
    private UserDAO userDAO;
}
