package com.violet.service.impl;

import com.github.pagehelper.PageHelper;
import com.violet.entity.User;
import com.violet.mapper.UserMapper;
import com.violet.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getUser();
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteByPrimaryKey(String userName) {
        return userMapper.deleteByPrimaryKey(userName);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String userName) {
        return userMapper.selectByPrimaryKey(userName);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}

