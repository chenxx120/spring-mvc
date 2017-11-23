package com.wocloud.service;

import com.wocloud.entity.User;

/**
 * Created by xinxin.chen on 2017/7/2.
 */
public interface UserService {
    void xin();

    User findById(int id);

}
