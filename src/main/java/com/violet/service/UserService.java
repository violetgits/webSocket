package com.violet.service;

import com.violet.entity.User;

import java.util.List;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-15 16:14
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
public interface UserService {


    List<User> getUser(int pageNum, int pageSize);

    int deleteByPrimaryKey(String userName);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
