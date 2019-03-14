package com.violet.service;

import com.github.pagehelper.PageHelper;
import com.violet.entity.User;
import com.violet.mapper.UserMapper;
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
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getUser();
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }
}
