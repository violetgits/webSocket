package com.violet.entity;

import lombok.Data;

import java.io.Serializable;

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
@Data
public class ApiUserInfos implements Serializable {
    /**
     * 授权唯一标识
     */
    private String auiAppId;

    /**
     * 用户状态,1：正常，0：无效
     */
    private String auiStatus;

    /**
     * 日请求量
     */
    private Integer auiDayRequestCount;

    /**
     * 绑定IP地址多个使用“,”隔开
     */
    private String auiAjaxBindIp;

    /**
     * 备注
     */
    private String auiMark;

    /**
     * 授权密钥
     */
    private byte[] auiAppSecret;

    private static final long serialVersionUID = 1L;
}