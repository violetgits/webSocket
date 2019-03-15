package com.violet.mapper;

import com.violet.entity.ApiUserInfos;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
public interface ApiUserInfosMapper {

    int deleteByPrimaryKey(String auiAppId);

    int insert(ApiUserInfos record);

    int insertSelective(ApiUserInfos record);

    ApiUserInfos selectByPrimaryKey(String auiAppId);

    int updateByPrimaryKeySelective(ApiUserInfos record);

    int updateByPrimaryKeyWithBLOBs(ApiUserInfos record);

    int updateByPrimaryKey(ApiUserInfos record);

    List<ApiUserInfos> findByAll(ApiUserInfos apiUserInfos);

    List<String> findAuiAppSecretByAuiAjaxBindIpOrderByAuiAppId(@Param("auiAjaxBindIp") String auiAjaxBindIp);


}