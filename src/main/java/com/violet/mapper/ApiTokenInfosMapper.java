package com.violet.mapper;

import com.violet.entity.ApiTokenInfos;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 10:27
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
public interface ApiTokenInfosMapper {

    int deleteByPrimaryKey(Integer atiId);

    int insert(ApiTokenInfos record);

    int insertSelective(ApiTokenInfos record);

    ApiTokenInfos selectByPrimaryKey(Integer atiId);

    int updateByPrimaryKeySelective(ApiTokenInfos record);

    int updateByPrimaryKeyWithBLOBs(ApiTokenInfos record);

    int updateByPrimaryKey(ApiTokenInfos record);
}