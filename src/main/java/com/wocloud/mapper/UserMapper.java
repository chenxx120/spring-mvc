package com.wocloud.mapper;

import com.wocloud.entity.User;

/**
 * Created by xinxin.chen on 2017/7/2.
 */
public interface UserMapper {
//    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(int id);
}
