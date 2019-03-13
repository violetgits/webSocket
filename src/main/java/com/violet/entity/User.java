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
public class User implements Serializable {

    private String userName;

    private String password;

    private String eMail;

    private static final long serialVersionUID = 1L;

}