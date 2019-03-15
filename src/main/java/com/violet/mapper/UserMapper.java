package com.violet.mapper;

import com.violet.entity.User;
import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(String userName);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUser();
}