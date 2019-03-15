package com.violet.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.violet.mapper.ApiTokenInfosMapper;
import com.violet.entity.ApiTokenInfos;
import com.violet.service.ApiTokenInfosService;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-15 16:09
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Service
public class ApiTokenInfosServiceImpl implements ApiTokenInfosService {

    @Resource
    private ApiTokenInfosMapper apiTokenInfosMapper;

    @Override
    public int deleteByPrimaryKey(Integer atiId) {
        return apiTokenInfosMapper.deleteByPrimaryKey(atiId);
    }

    @Override
    public int insert(ApiTokenInfos record) {
        return apiTokenInfosMapper.insert(record);
    }

    @Override
    public int insertSelective(ApiTokenInfos record) {
        return apiTokenInfosMapper.insertSelective(record);
    }

    @Override
    public ApiTokenInfos selectByPrimaryKey(Integer atiId) {
        return apiTokenInfosMapper.selectByPrimaryKey(atiId);
    }

    @Override
    public int updateByPrimaryKeySelective(ApiTokenInfos record) {
        return apiTokenInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(ApiTokenInfos record) {
        return apiTokenInfosMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(ApiTokenInfos record) {
        return apiTokenInfosMapper.updateByPrimaryKey(record);
    }

}


