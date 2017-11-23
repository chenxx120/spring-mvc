package com.wocloud.service.impl;

import com.wocloud.dao.UserDao;
import com.wocloud.mapper.UserMapper;
import com.wocloud.entity.User;
import com.wocloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xinxin.chen on 2017/7/2.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Autowired
    private UserDao userDao;

    public void xin(){
        userDao.xin();
        System.out.println("UserServiceImpl.wocloud()");
    }
}
