package com.violet.mapper;

import com.violet.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 10:05
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Mapper
public interface UserMapper {
    /**
     * insert
     *
     * @param record record
     * @return int
     */
    int insert(User record);

    /**
     * insert
     *
     * @param record record
     * @return int
     */
    int insertSelective(User record);

    /**
     * 获取用户
     *
     * @return user
     */
    List<User> getUser();
}