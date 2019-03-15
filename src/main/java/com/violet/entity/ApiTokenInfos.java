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
public class ApiTokenInfos implements Serializable {
    private Integer atiId;

    private String atiAppId;

    /**
     * 生成token时间（秒单位）
     */
    private String atiBuildTime;

    private byte[] atiToken;

    private static final long serialVersionUID = 1L;
}