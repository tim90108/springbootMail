package com.tim.springbootmall.service.ProductServiceImpl;

import com.tim.springbootmall.dao.ProductDao;
import com.tim.springbootmall.dao.UserDao;
import com.tim.springbootmall.dto.UserRegisterRequest;
import com.tim.springbootmall.model.User;
import com.tim.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
