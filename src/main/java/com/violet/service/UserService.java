package com.violet.service;

import com.violet.entity.User;
import com.violet.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 16:58
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getUser() {
        return userMapper.getUser();
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }
}
